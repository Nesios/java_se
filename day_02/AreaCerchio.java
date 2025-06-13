package day_02;

import java.util.Scanner;

/*
* Esercizio_04
* Calcolo dell'area di un cerchio
* Traccia: Scrivi un programma Java che chieda all'utente di inserire il raggio
* di un cerchio e stampi l'area corrispondente. Utilizza il valore costante di π
* come 3.14159.
*/

public class AreaCerchio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il raggio del cerchio:");
		double raggio = input.nextDouble();
		double area = Math.PI * raggio * raggio;

		System.out.println("L'area del cerchio è: " + area);

		input.close();
	}
}