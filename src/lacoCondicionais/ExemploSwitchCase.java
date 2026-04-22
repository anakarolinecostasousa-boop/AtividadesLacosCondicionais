package lacoCondicionais;

import java.util.Scanner;

public class ExemploSwitchCase {
	public static void main(String[] args) {

        int opcao;
        Scanner leia = new Scanner(System.in);

        System.out.println("# ## ### #### ######## Menu ######## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Livro: O Alquimista");
                break;
            case 2:
                System.out.println("Frase: A persistência realiza o impossível.");
                break;
            case 3:
                System.out.println("Música: Imagine - John Lennon");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        leia.close();
    }



}
