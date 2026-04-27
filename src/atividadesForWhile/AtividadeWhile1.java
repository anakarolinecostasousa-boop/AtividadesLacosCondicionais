package atividadesForWhile;

import java.util.Scanner;

public class AtividadeWhile1 {

	public static void main(String[] args) {
		int idade = 0;
		int i;
		int menores21 = 0;
		int maiores50 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (idade>=0){
			System.out.println("Digite sua idade: ");
			idade = scanner.nextInt();
			if(idade<21) {
				menores21++;
			} else if(idade>50) {
				maiores50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+ menores21);
		System.out.println("Total de pessoas maiores de 50 anos: "+ maiores50);

	}

}
