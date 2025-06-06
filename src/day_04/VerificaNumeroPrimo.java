package day_04;

import java.util.Scanner;

/*
 * Esercizio 10
 * Verifica se un numero è primo
 * Scrivi un programma Java che verifica se un numero dato è primo o meno.
 */

public class VerificaNumeroPrimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero positivo:");
		int numero = input.nextInt();
		
		boolean isPrimo = true;
		
		if (numero <= 1) {
			isPrimo = false; // Numeri <= 1 non sono primi
		 } else {
			// Controlliamo se il numero ha divisori diversi da 1 e se stesso
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					isPrimo = false;
					break; // Esci dal ciclo appena trovi un divisore
				}
			}
		}
		
		if (isPrimo) {
			System.out.println(numero + " è un numero primo.");
		} else {
			System.out.println(numero + " non è un numero primo.");
		}
			
		input.close();
	}

}