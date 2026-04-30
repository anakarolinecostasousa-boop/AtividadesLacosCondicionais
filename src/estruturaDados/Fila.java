package estruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		int opcao;

		do {
			System.out.println("********************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("********************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String cliente = scanner.nextLine();
				fila.add(cliente);
				System.out.println(cliente + " foi adicionado à fila.");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila: " + fila);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String chamado = fila.poll();
					System.out.println(chamado + " foi chamado e retirado da fila.");
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
