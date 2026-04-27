package atividadesForWhile;

import java.util.Scanner;

public class AtividadeFor2 {

	public static void main(String[] args) {
		int numero;
		int i;
		int pares = 0;
		int impares = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(i = 1; i<=10; i++){
			System.out.println("Digite o "+ i+ "º número: ");
			numero = scanner.nextInt();
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
				
			}
		}
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
	}

}
