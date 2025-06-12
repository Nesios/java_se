package day_04;

import java.util.Scanner;

/*
 * Eserzizio 02
 * Calcolo del numero di occorrenze di una lettera in
 * una stringa
 * Scrivi un programma Java che calcola il numero di occorrenze di una lettera
 * specificata all'interno di una stringa data.
 */

public class CartaOccorrenzeLettera {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:");
		String testo = scanner.nextLine();
		
		System.out.println("Inserisci una lettera da cercare:");
		String inputLettera = scanner.nextLine();
		
		// Verifica che l'input sia lungo esattamente 1 carattere
        if (inputLettera.length() != 1) {
            System.out.println("Devi inserire una sola lettera.");
            scanner.close();
            return;
        }
        
        char lettera = inputLettera.charAt(0);
        int conteggio = 0;
        
        for (int i = 0; i < testo.length(); i++) {
        	 if (testo.charAt(i) == lettera) {
        		 conteggio++;
        	 }
        }

        System.out.println("La lettera '" + lettera + "' appare " + conteggio + " volte.");
        
        scanner.close();
	}

}