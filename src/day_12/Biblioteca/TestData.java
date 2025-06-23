package day_12.Biblioteca;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TestData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = null;
		boolean erroreStampato = false;

		while (data == null || data.getDay() == 0) {
			int giorno = 0, mese = 0, anno = 0;

			// Lettura giorno con controllo input valido
			while (true) {
				System.out.print("Inserisci il giorno (solo in cifre): ");
				try {
					giorno = scanner.nextInt();
					break; // input valido, esce dal ciclo
				} catch (InputMismatchException e) {
					System.out.println("\nDevi inserire una cifra.");
					scanner.next(); // scarta input non valido
				}
			}

			// Lettura mese con controllo input valido
			while (true) {
				System.out.print("Inserisci il mese (solo in cifre): ");
				try {
					mese = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("\nDevi inserire una cifra.");
					scanner.next();
				}
			}

			// Lettura anno con controllo input valido
			while (true) {
				System.out.print("Inserisci l'anno (solo in cifre): ");
				try {
					anno = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("\nDevi inserire una cifra.");
					scanner.next();
				}
			}

			data = new Data(giorno, mese, anno);

			if (data.getDay() == 0) {
				if (!erroreStampato) {
					System.out.println("Data non valida, riprova.");
					erroreStampato = true;
				}
			} else {
				erroreStampato = false;
			}
		}

		Data giornoPrima = new Data(data.getDay(), data.getMonth(), data.getYear());
		giornoPrima.previousDay();

		Data giornoDopo = new Data(data.getDay(), data.getMonth(), data.getYear());
		giornoDopo.nextDay();

		System.out.println("\nData inserita: " + data);
		System.out.println("Giorno precedente: " + giornoPrima);
		System.out.println("Giorno successivo: " + giornoDopo);

		scanner.close();
	}
}