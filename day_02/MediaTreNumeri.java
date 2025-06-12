package day_02;

import java.util.Scanner;

/*
* Esercizio 06
* Calcolo della media di tre numeri
* Traccia: Scrivi un programma Java che chieda all'utente di inserire una
* temperatura in gradi Celsius e stampi la corrispondente temperatura in
* gradi Fahrenheit. Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32.
*/


public class MediaTreNumeri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero:");
		double num1 = input.nextDouble();
		 
		System.out.println("Inserisci il secondo numero:");
		double num2 = input.nextDouble();
		 
		System.out.println("Inserisci il terzo numero:");
		double num3 = input.nextDouble();
		 
		double media = (num1 + num2 + num3) / 3.0;
		 
		System.out.println("La media dei tre numeri è: " + media);
		 
		input.close();
	}
}