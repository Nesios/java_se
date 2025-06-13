package day_04;

import java.util.Scanner;

/*
 * Esercizio 09
 * Calcolo del Fattoriale
 * Scrivi un programma Java che calcola il fattoriale di un numero dato.
 * es. 9! = 9*8*7*6*5*4*3*2*1
 */

public class CalcoloFattoriale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero positivo:");
		int numero = input.nextInt();
		
		if (numero < 0) {
			System.out.println("Il fattoriale non è definito per numeri negativi.");
		} else {
			long fattoriale = 1;
			
			for (int i = 1; i <= numero; i++) {
				fattoriale *= i;  // moltiplica fattoriale per i
			}
			
			System.out.println(numero + "! = " + fattoriale);
		}
		
		input.close();
	}

}