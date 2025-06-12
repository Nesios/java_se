/*package day_07;

import java.util.Scanner;

public class GiardinoAsilo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 12 bambini in ordine alfabetico
		String[] bambini = { "Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph",
				"Kincaid", "Larry" };

		System.out.println("Inserisci la prima fila di piante:");
		String fila1 = scanner.nextLine();

		System.out.println("Inserisci la seconda fila di piante:");
		String fila2 = scanner.nextLine();

		// Ogni bambino ha 4 piante: 2 dalla prima fila e 2 dalla seconda
		for (int i = 0; i < bambini.length; i++) {
			// Indice di partenza per questo bambino (ogni bambino prende 2 tazze per fila)
			int startIndex = i * 2;

			// Prendiamo 2 piante dalla prima fila e 2 dalla seconda fila
			String pianteBambino = fila1.substring(startIndex, startIndex + 2)
					+ fila2.substring(startIndex, startIndex + 2);
			
			// Convertiamo le lettere in nomi delle piante
			String pianteNominate = "";
			for (int j = 0; j < pianteBambino.length(); j++) {
				char c = pianteBambino.charAt(j);
				pianteNominate += nomePianta(c);
				if (j < pianteBambino.length() - 1) {
					pianteNominate += ", ";
				}
			}
			
			System.out.println(bambini[i] + ": " + pianteNominate);
		}
		
		scanner.close();

	}
	
	// Metodo che traduce la lettera nel nome della pianta
	public static String nomePianta(char c) {
		switch (c) {
			case 'G':
				return "Erba";
			case 'C':
				return "Trifoglio";
			case 'R':
				return "Ravanello";
			case 'V':
				return "Violetta";
			default:
				return "Sconosciuta";
		}
	}

}*/

package day_07;

import java.util.Random;

public class GiardinoAsilo {

	public static void main(String[] args) {
		// Nomi dei bambini in ordine alfabetico
		String[] bambini = { "Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph",
				"Kincaid", "Larry"

		};

		// Codici delle piante
		char[] piante = { 'G', 'C', 'R', 'E' };

		Random rand = new Random();

		// Genera le due righe di 24 caratteri casuali
		StringBuilder primaFila = new StringBuilder();
		StringBuilder secondaFila = new StringBuilder();

		for (int i = 0; i < 24; i++) {
			primaFila.append(piante[rand.nextInt(piante.length)]);
			secondaFila.append(piante[rand.nextInt(piante.length)]);

		}

		System.out.println("Prima fila: " + primaFila);
		System.out.println("Seconda fila: " + secondaFila);
		System.out.println();

		// Si assegnano 4 piante ad ogni bambino:
		// per ogni bambino prendiamo 2 lettere dalla prima fila e 2 dalla seconda

		for (int i = 0; i < bambini.length; i++) {
			int indice = i * 2; // ogni bambino ha 2 tazze per fila

			char pianta1 = primaFila.charAt(indice);
			char pianta2 = primaFila.charAt(indice + 1);
			char pianta3 = secondaFila.charAt(indice);
			char pianta4 = secondaFila.charAt(indice + 1);

			System.out.println(bambini[i] + ": " + piantaToNome(pianta1) + ", " + piantaToNome(pianta2) + ", "
					+ piantaToNome(pianta3) + ", " + piantaToNome(pianta4));

		}
	}

	// Mostro il codice generato automaticamente
	public static String piantaToNome(char c) {
		return switch (c) {
		case 'G' -> "Erba";
		case 'C' -> "Trifoglio";
		case 'R' -> "Ravanello";
		case 'E' -> "Violetta";
		default -> "Sconosciuta";
		};
	}
}