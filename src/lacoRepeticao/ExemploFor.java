package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		int i;
		String nome;
        Scanner leia = new Scanner(System.in);
        
        for (i = 0; i<3; i++) {
        
        System.out.println("Digite o 1º nome: ");
        nome = leia.nextLine();
        System.out.println("O 1º nome é: " + nome);
        }

	}

}
