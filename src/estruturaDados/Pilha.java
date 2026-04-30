package estruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();
		int opcao;

		do {
			System.out.println("*************************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("*************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // consumir quebra de linha

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do Livro: ");
				String livro = scanner.nextLine();
				pilha.push(livro);
				System.out.println(livro + " foi adicionado à pilha.");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha: " + pilha);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String retirado = pilha.pop();
					System.out.println(retirado + " foi retirado da pilha.");
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

		scanner.close();
	}

}
