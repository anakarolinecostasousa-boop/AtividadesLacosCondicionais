package lacosCondicionaisAtividade;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        // Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            // Verifica se é positivo ou negativo
            if (numero >= 0) {
                System.out.println("O Número " + numero + " é par e positivo!");
            } else {
                System.out.println("O Número " + numero + " é par e negativo!");
            }
        } else {
            if (numero >= 0) {
                System.out.println("O Número " + numero + " é ímpar e positivo!");
            } else {
                System.out.println("O Número " + numero + " é ímpar e negativo!");
            }
        }

        leia.close();
    }


	}
