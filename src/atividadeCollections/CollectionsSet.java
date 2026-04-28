package atividadeCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();

		while (numeros.size() < 10) {
			System.out.print("Digite um número inteiro: ");
			int valor = scanner.nextInt();
			if (!numeros.add(valor)) {
				System.out.println("Valor repetido! Digite outro número.");
			}
		}

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		scanner.close();
	}

}
