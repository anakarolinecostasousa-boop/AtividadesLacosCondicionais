package lacoCondicionais;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua nota 1: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) /2;
		
		
		if (media >= 6) {
		    System.out.println("Parabéns, pessoa participante aprovada!");
		} else {
		    System.out.println("Infelizmente, a pessoa participante foi reprovada.");
		}
		
	} 
	

}
