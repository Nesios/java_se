package day_03;

import java.util.Scanner;

/*
 * Esercizio 01
 * Calcolo del resto della divisione tra due numeri
 * Implementa un programma che chieda all'utente di inserire due numeri e
 * calcoli il resto della divisione tra il primo numero e il secondo numero
 * utilizzando l'operatore modulo.
 */

public class CalcoloModulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci il primo numero (dividendo): ");
		int primoNumero = scanner.nextInt();
		
		System.out.print("Inserisci il secondo numero (divisore): ");
		int secondoNumero = scanner.nextInt();
		
		// Controllo per evitare divisione per zero
		if (secondoNumero == 0) {
			System.out.println("Errore: il divisore non può essere zero.");
		} else {
			int resto = primoNumero % secondoNumero;
			System.out.println("Il resto della divisione tra " + primoNumero + " e " + secondoNumero + " è: " + resto);
		}
		
		scanner.close();
	}

}