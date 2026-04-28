package atividadeVetoreseMatrizes;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		int[] valores = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Vetor: ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();

		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = scanner.nextInt();

		boolean encontrado = false;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + i);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		scanner.close();
	}

}
