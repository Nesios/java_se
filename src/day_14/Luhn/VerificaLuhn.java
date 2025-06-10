package day_14.Luhn;

import java.util.Scanner;

public class VerificaLuhn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una sequenza numerica intera di 16 cifre");
		String numeri = input.nextLine();
		numeri=numeri.replace(" ","");
		numeri=numeri.replace("-","");
		int somma = 0;
		for (int i = numeri.length()-1; i >= 0; i--) {
			// i=incognita; %=divisione indicante il resto; != risultato diverso da numero
			// desiderato
			int prodotto = (numeri.charAt(i) - '0');
			if (i % 2 == 0) { // così prendi gli indici dispari
				prodotto *=2;
				if (prodotto > 9) {
					prodotto -= 9; // sarebbe come scrivere "prodotto = prodotto -9"
				}
			}
			somma += prodotto; // sarebbe come scrivere somma=somma+prodotto
		}
		if (somma % 10 == 0) {
			System.out.println("Numero di Luhn valido");
		} else {
			System.out.println("Numero di Luhn non valido");
		}
	}
}