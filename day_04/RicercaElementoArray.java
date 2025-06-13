package day_04;

import java.util.Scanner;

/*
 * Esercizio 08
 * Ricerca di un elemento in un array
 * Scrivi un programma Java che ricerca un elemento specifico all'interno di un
 * array di interi e restituisce la sua posizione (indice).
 */

public class RicercaElementoArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 7, 8, 9, 10, 11, 12 };
		int[] array3 = { 13, 14, 15, 16, 17, 18 };
		int[] array4 = { 19, 20, 21, 22, 23, 24 };
		int[] array5 = { 25, 26, 27, 28, 29, 30 };

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero da cercare:");
		int target = input.nextInt();

		boolean trovato = false; // Variabile per sapere se abbiamo trovato il numero

		// Ciclo per controllare uno ad uno i 5 array
		for (int arrayNum = 1; arrayNum <= 5; arrayNum++) {
			int[] currentArray;

			// Scegliamo quale array usare in base al numero (arrayNum)
			switch (arrayNum) {
			case 1:
				currentArray = array1;
				break;
			case 2:
				currentArray = array2;
				break;
			case 3:
				currentArray = array3;
				break;
			case 4:
				currentArray = array4;
				break;
			case 5:
				currentArray = array5;
				break;
			default:
				currentArray = new int[0]; // Non usato ma serve per sicurezza
			}

			// Cerchiamo il numero target dentro l'array scelto
			for (int i = 0; i < currentArray.length; i++) {
				if (currentArray[i] == target) {
					System.out.println("Numero trovato nell'array " + arrayNum + " all'indice22 " + (i + 1));
					trovato = true;

				}
			}
		}

		if (!trovato) {
			System.out.println("Numero non trovato in nessun array.");
		}

		input.close();
	}
}