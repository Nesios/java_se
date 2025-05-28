package day_05;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci la frase: ");
		String frase = scanner.nextLine();
//radar
//01234
		// int intero = 5/2;
		// System.out.println("intero "+intero);
		for (int i = 0; i < frase.length() / 2; i++) {
			if (!(frase.charAt(i) == frase.charAt(frase.length() - 1 - i))) {
				System.out.println("non è palindroma");
				return;
			}
		}
		System.out.println("è palindroma");
	}
}
