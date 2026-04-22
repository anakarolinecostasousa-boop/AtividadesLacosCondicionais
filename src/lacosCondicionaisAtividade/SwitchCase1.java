package lacosCondicionaisAtividade;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o código do produto (1 a 6): ");
		int codigo = leia.nextInt();

		System.out.print("Digite a quantidade: ");
		int quantidade = leia.nextInt();

		String produto = "";
		double preco = 0.0;

		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.00;
			break;
		default:
			System.out.println("Código inválido!");
			leia.close();
			return;
		}

		double total = quantidade * preco;

		System.out.println("Produto: " + produto);
		System.out.printf("Valor total: R$ %.2f%n", total);

		leia.close();
	}

}
