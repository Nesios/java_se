package day_02;

import java.util.Scanner;

/*
 * Esercizio_01
 * Somma di due numeri
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire due
 * numeri interi e stampi la loro somma
 */
public class SommaNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il primo numero");
		int numero1 = input.nextInt();
		System.out.println("inserisci il secondo numero");
		int numero2 = input.nextInt();
		int somma = numero1 + numero2;
		System.out.println("somma dei due numeri: " + somma);
		input.close();	}
}
