package lacoCondicionais;

import java.util.Scanner;

public class ExemploElseEncadeado {
	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua nota 1: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite sua nota 1: ");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Parabéns, pessoa participante aprovada!");
		}
		else if (media >= 5) { 
		    System.out.println("Pessoa participante de exame.");
		}

		else {
			System.out.println("Infelizmente, a pessoa participante foi reprovada.");
		}

	}
}