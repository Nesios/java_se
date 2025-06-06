package day_03;

import java.util.Scanner;

/*
 * Esercizio 03
 * Verifica se un numero è pari o dispari
 * Implementa un programma che chieda all'utente di inserire un numero
 * intero e verifichi se è pari o dispari utilizzando l'operatore modulo.
 */

public class PariDispari {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " è un numero pari.");
		} else {
			System.out.println(numero + " è un numero dispari.");
		}

		scanner.close();
	}

}