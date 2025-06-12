package day_07;

import java.util.Scanner;

public class ProdottoSeriePiuGrande {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci la sequenza di cifre: ");
		String input = scanner.nextLine();
		
		System.out.print("Inserisci la lunghezza della serie (span): ");
		int span = scanner.nextInt();
		
		if (span > input.length() || span <= 0) {
			System.out.println("Span non valido rispetto alla lunghezza della sequenza.");
			scanner.close();
			return;
			
		}
		
		int maxProdotto = 0;
		String serieMassima = "";
		
		// Ciclo per scorrere tutte le sottostringhe di lunghezza span
		for (int i = 0; i <= input.length() - span; i++) {
			String serie = input.substring(i, i + span);
			int prodotto = calcolaProdotto(serie);
			
			if (prodotto > maxProdotto) {
				maxProdotto = prodotto;
				serieMassima = serie;
			}
		}
		
		System.out.println("Serie con prodotto massimo: " + serieMassima);
		System.out.println("Prodotto massimo: " + maxProdotto);
		
		scanner.close();

	}
	
	// Metodo per calcolare il prodotto delle cifre di una stringa
	public static int calcolaProdotto(String serie) {
		int prodotto = 1;
		for (int i = 0; i < serie.length(); i++) {
			int cifra = serie.charAt(i) - '0'; // converte char a int
			prodotto *= cifra;
		}
		
		return prodotto;
	}

}