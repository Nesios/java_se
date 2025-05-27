package day_04;

import java.util.Scanner;

/* Scrivi un programma Java che calcola il numero di parole presenti in una
stringa data. Si considera una parola come una sequenza di caratteri
separati da spazi.
*/

public class CalcolaNumeroParole {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String frase = input.nextLine();
		char carattere = ' ';
		boolean interruttore = true;
		int count = 0;
		for (int i = 0; i < frase.length(); i++) {
			carattere = frase.charAt(i);
			if (Character.isAlphabetic(carattere) && interruttore) {
				count = count + 1;// Oppure posso scirvere count++
				interruttore = false;
			} else {
				if (!Character.isAlphabetic(carattere)) {
					interruttore = true;
				}
			}
		}
		System.out.println("Numero di parole che compongono la frase è " + count);
		input.close();
	}
}
