package day_03;

import java.util.Scanner;

/*
 * Esercizio 06
 * Scrivi le iniziali del tuo nome
 * Scrivere un programma che visualizzi sullo schermo del terminale le vostre
 * iniziali grandi e centrate composta da molti caratteri uguali.
 */

public class InizialiGrandi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la prima iniziale: ");
		char iniziale1 = input.next().toUpperCase().charAt(0);
		
		System.out.println("Inserisci la seconda iniziale: ");
		char iniziale2 = input.next().toUpperCase().charAt(0);
		
		// Stampa della prima iniziale (esempio solo per 'F')
		System.out.println("\nIniziale 1: " + iniziale1);
		if (iniziale1 == 'F') {
			System.out.println(" " + iniziale1 + iniziale1 + iniziale1 + iniziale1 + iniziale1);
			System.out.println(" " + iniziale1);
			System.out.println(" " + iniziale1 + iniziale1 + iniziale1);
			System.out.println(" " + iniziale1);
			System.out.println(" " + iniziale1);
		} else {
			System.out.println("(Disegno non disponibile per questa lettera)");
		}
		
		System.out.println(); // Riga vuota
		
		// Stampa della seconda iniziale (esempio solo per 'P')
		System.out.println("Iniziale 2: " + iniziale2);
		if (iniziale2 == 'P') {
			System.out.println(" " + iniziale2 + iniziale2 + iniziale2 + iniziale2);
			System.out.println(" " + iniziale2 + "   " + iniziale2);
			System.out.println(" " + iniziale2 + iniziale2 + iniziale2 + iniziale2);
			System.out.println(" " + iniziale2);
			System.out.println(" " + iniziale2);
		} else {
			System.out.println("(Disegno non disponibile per questa lettera)");
		}
		input.close();
	}

}