package day_06;

import java.util.Scanner;

/*

Esercizio 02
Diamante */
public class DiamanteLettere {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Inserisci una lettera qualsiasi (A-Z):");
	char lettera = input.next().toUpperCase().charAt(0);
	
	int distanza = lettera - 'A';
	int dimensione = 2 * distanza + 1;
	
	// Ciclo sulle righe
	for (int riga = 0; riga < dimensione; riga++) {
		int indiceLettera;
		if (riga <= distanza) {
			indiceLettera = riga;  // metà superiore
		} else {
			indiceLettera = dimensione - riga - 1;  // metà inferiore
		}
		
		// Spazi a sinistra
		for (int s = 0; s < distanza - indiceLettera; s++) {
			System.out.print(" ");
		}
		
		// Stampa la prima lettera della riga
		System.out.print((char) ('A' + indiceLettera));
		
		if (indiceLettera != 0) {
			// Spazi interni tra le due lettere
			int spaziInterni = 2 * indiceLettera - 1;
			for (int s = 0; s < spaziInterni; s++) {
				System.out.print(" ");
			}
			
			// Stampa la seconda lettera
			System.out.print((char) ('A' + indiceLettera));
		}
		
		System.out.println();
		
	}
	
	input.close();

}
}