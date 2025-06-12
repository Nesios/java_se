package day_03;

import java.util.Scanner;

/*
 * Esercizio 04
 * Calcolo dell'area di un trapezio
 * Implementa un programma che chieda all'utente di inserire la lunghezza
 * delle basi e l'altezza di un trapezio e calcoli la sua area utilizzando le
 * formule geometriche.
 */

public class AreaTrapezio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci la lunghezza della prima base: ");
		double base1 = scanner.nextDouble();
		
		System.out.println("Inserisci la lunghezza della seconda base: ");
		double base2 = scanner.nextDouble();
		
		System.out.println("Inserisci l'altezza: ");
		double altezza = scanner.nextDouble();
		
		double area = ((base1 + base2) / 2) * altezza;
		
		System.out.println("L'area del trapezio è: " + area);
		
		scanner.close();

	}

}