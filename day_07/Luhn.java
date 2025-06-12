package day_07;

import java.util.Scanner;
import java.util.Random;

public class Luhn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Scegli un'opzione:");
		System.out.println("1 - Inserisci un numero di carta");
		System.out.println("2 - Genera un numero di carta valido casuale");
		System.out.print("Scelta: ");

		int scelta;
		if (scanner.hasNextInt()) {
			scelta = scanner.nextInt();
			scanner.nextLine(); // Consuma il \n
		} else {
			System.out.println("Input non valido: inserisci 1 o 2.");
			scanner.close();
			return;
		}

		String numero;

		switch (scelta) {
		case 1:
			System.out.print("Inserisci il numero di carta (puoi mettere anche spazi): ");
			numero = scanner.nextLine().replaceAll("\\s+", "");
			break;
		case 2:
			numero = generaNumeroCartaValido(16);
			System.out.println("Numero generato: " + numero);
			break;
		default:
			System.out.println("Scelta non valida. Programma terminato.");
			scanner.close();
			return;
		}

		if (!numero.matches("\\d+")) {
			System.out.println("Input non valido: inserisci solo cifre con o senza spazi.");
		} else if (isValidLuhn(numero)) {
			System.out.println("Il numero è valido.");
		} else {
			System.out.println("Il numero NON è valido.");
		}

		scanner.close();
	}

	public static boolean isValidLuhn(String numero) {
		int somma = 0;
		boolean raddoppia = false;

		for (int i = numero.length() - 1; i >= 0; i--) {
			int cifra = Character.getNumericValue(numero.charAt(i));

			if (raddoppia) {
				cifra *= 2;
				if (cifra > 9) {
					cifra -= 9;
				}
			}

			somma += cifra;
			raddoppia = !raddoppia;
		}

		return somma % 10 == 0;
	}

	public static String generaNumeroCartaValido(int lunghezza) {
		Random random = new Random();
		int[] cifre = new int[lunghezza];

		for (int i = 0; i < lunghezza - 1; i++) {
			cifre[i] = random.nextInt(10);
		}

		int somma = 0;
		boolean raddoppia = true;

		for (int i = lunghezza - 2; i >= 0; i--) {
			int cifra = cifre[i];
			if (raddoppia) {
				cifra *= 2;
				if (cifra > 9) {
					cifra -= 9;
				}
			}
			somma += cifra;
			raddoppia = !raddoppia;
		}

		int checksum = (10 - (somma % 10)) % 10;
		cifre[lunghezza - 1] = checksum;

		StringBuilder sb = new StringBuilder();
		for (int c : cifre) {
			sb.append(c);
		}
		return sb.toString();
	}
}