package day_04;

import java.util.Scanner;

/*
 * Esercizio 04
 * Inversione di una stringa
 * Scrivi un programma Java che inverte una stringa data.
 */

public class InvertiStringa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa da invertire:");
		String testo = scanner.nextLine();
		
		// Invertiamo la stringa con StringBuilder
		String invertita = new StringBuilder(testo).reverse().toString();
		
		System.out.println("Stringa invertita: " + invertita);
		
		scanner.close();

	}

}