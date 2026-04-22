package lacosCondicionaisAtividade;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);

		        System.out.print("Digite o nome do colaborador: ");
		        String nome = leia.nextLine();

		        System.out.print("Digite o código do cargo (1 a 6): ");
		        int codigo = leia.nextInt();

		        System.out.print("Digite o salário atual: ");
		        double salario = leia.nextDouble();

		        String cargo = "";
		        double percentual = 0.0;

		        switch (codigo) {
		            case 1:
		                cargo = "Gerente";
		                percentual = 0.10;
		                break;
		            case 2:
		                cargo = "Vendedor";
		                percentual = 0.07;
		                break;
		            case 3:
		                cargo = "Supervisor";
		                percentual = 0.09;
		                break;
		            case 4:
		                cargo = "Motorista";
		                percentual = 0.06;
		                break;
		            case 5:
		                cargo = "Estoquista";
		                percentual = 0.05;
		                break;
		            case 6:
		                cargo = "Técnico de TI";
		                percentual = 0.08;
		                break;
		            default:
		                System.out.println("Código inválido!");
		                leia.close();
		                return;
		        }

		        double novoSalario = salario + (salario * percentual);

		        System.out.println("\nNome do colaborador: " + nome);
		        System.out.println("Cargo: " + cargo);
		        System.out.printf("Salário: R$ %.2f%n", novoSalario);

		        leia.close();
		    }

}
