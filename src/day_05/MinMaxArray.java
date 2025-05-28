package day_05;

import java.util.Scanner;

//Esercizio_08: Ricerca di un elemento in un array
//Scrivi un programma Java che ricerca un elemento specifico all'interno di un array di interi e restituisce la sua posizione (indice).

public class MinMaxArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeri = { 10, 87, 128, 349 };
		System.out.println("Inserisci il numero da ricercare nell'array");
		int numero = input.nextInt();
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == numero) {
				System.out.println("numero trovato");
				break;
			} else if (i == numeri.length - 1) {
				System.out.println("numero non trovato, prova ancora");
			}
		}

	}

}
