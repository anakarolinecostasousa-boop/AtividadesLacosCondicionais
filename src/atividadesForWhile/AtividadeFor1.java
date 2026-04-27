package atividadesForWhile;

import java.util.Scanner;

public class AtividadeFor1 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int i;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero:");
		numero2 = scanner.nextInt();
		scanner.close();
		
		if (numero1<numero2) {
			System.out.println("No Intervalo entre 10 e 100:");
			for(i= numero1; i <= numero2; i++ ) { 
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
					
				}
			} 
		} else {
			System.out.println("intervalo inválido");
			
		}
	}
}
