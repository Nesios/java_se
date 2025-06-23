package day_04; // Il package va all'inizio

// Importa la classe Scanner qui, prima della dichiarazione della classe CalcoloDiPotenza
import java.util.Scanner;

public class CalcoloDiPotenza {

	public static void main(String[] args) {
		// Esercizio_05: Calcolo della potenza di un numero Scrivi un programma Java che
		// calcola la potenza di un numero base elevato a un esponente dato.

		// Tutto il codice eseguibile deve stare all'interno di un metodo, come il main
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci un numero:");
		double numero = scanner.nextDouble();

		System.out.print("Inserisci l'esponente a cui elevarlo:"); // Ho cambiato "potenza" in "esponente" per chiarezza
		int esponente = scanner.nextInt(); // Ho cambiato "potenza" in "esponente"

		double risultato = 1;

		// Gestione del caso in cui l'esponente sia negativo o zero (potenza zero = 1)
		if (esponente < 0) {
			System.out.println("L'esponente negativo non è supportato in questo semplice calcolo.");
			// Puoi implementare qui la logica per esponenti negativi (1 / (base ^
			// |esponente|))
			scanner.close();
			return; // Termina il programma
		} else if (esponente == 0) {
			risultato = 1; // Qualsiasi numero (tranne 0) elevato a 0 fa 1
		} else {
			for (int i = 0; i < esponente; i++) { // Usa 'esponente' invece di 'potenza'
				risultato = risultato * numero;
			}
		}

		System.out.println("Risultato: " + risultato);

		scanner.close(); // È buona pratica chiudere lo Scanner quando non serve più
	}
}