package day_04;

import java.util.Scanner;

/*
 * Esercizio 03
 * Verifica se una stringa è un palindromo
 * Scrivi un programma Java che verifica se una stringa data è un palindromo
 * (cioè se può essere letta allo stesso modo da destra a sinistra e viceversa)
 */

public class VerificaPalindromo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:");
		String testo = scanner.nextLine();
		
		// Rimuove spazi e rende tutto minuscolo
		String pulito = testo.replaceAll("\\s+", "").toLowerCase();
		
		// Inverte la stringa
		String inverso = new StringBuilder(pulito).reverse().toString();
		
		// Confronta
		if (pulito.equals(inverso)) {
			System.out.println("La stringa è un palindromo.");
		} else {
			System.out.println("La stringa NON è un palindromo.");
		}
		
		scanner.close();

	}

}