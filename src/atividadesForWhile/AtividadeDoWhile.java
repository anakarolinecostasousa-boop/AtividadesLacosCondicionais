package atividadesForWhile;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int soma = 0;

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero > 0) {
				soma += numero; 
			}

		} while (numero != 0); 

		System.out.println("A soma dos números positivos é: " + soma);

		sc.close();
	}

}
