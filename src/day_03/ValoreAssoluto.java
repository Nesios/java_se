package day_03;

import java.util.Scanner;

/*
 * Esercizio 02
 * Calcolo del valore assoluto di un numero
 * Implementa un programma che chieda all'utente di inserire un numero e
 * calcoli il suo valore assoluto utilizzando il metodo abs() della classe Math.
 */

public class ValoreAssoluto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un numero (intero o decimale): ");
		double numero = scanner.nextDouble();
		
		double valoreAssoluto = Math.abs(numero);
		
		System.out.println("Il valore assoluto di " + numero + " è: " + valoreAssoluto);
		
		scanner.close();
		
	}

}