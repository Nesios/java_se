package day_12.Tennis;

public class MainTest {
	public static void main(String[] args) {
		Campo campo = new Campo();

		System.out.println("---- Inizio test prenotazioni campo tennis ----\n");

		// Provo a prenotare il campo dalle 9 alle 11 per "Luca"
		boolean pren1 = campo.addPren(9, 11, "Luca");
		System.out.println("Prenotazione 1 (Luca 9-11): " + (pren1 ? "Riuscita" : "Fallita"));
		System.out.println(campo);
		System.out.println("------------------------------------------------\n");

		// Provo a prenotare dalle 10 alle 12 per "Anna" (sovrapposizione, dovrebbe
		// fallire)
		boolean pren2 = campo.addPren(10, 12, "Anna");
		System.out.println("Prenotazione 2 (Anna 10-12): " + (pren2 ? "Riuscita" : "Fallita - Sovrapposizione"));
		System.out.println(campo);
		System.out.println("------------------------------------------------\n");

		// Provo a prenotare dalle 12 alle 13 per "Marco" (dovrebbe andare bene)
		boolean pren3 = campo.addPren(12, 13, "Marco");
		System.out.println("Prenotazione 3 (Marco 12-13): " + (pren3 ? "Riuscita" : "Fallita"));
		System.out.println(campo);
		System.out.println("------------------------------------------------\n");

		// Provo a rimuovere la prenotazione di Luca (9-11)
		boolean remove1 = campo.removePren(9, 11, "Luca");
		System.out.println("Rimozione prenotazione Luca 9-11: " + (remove1 ? "Riuscita" : "Fallita"));
		System.out.println(campo);
		System.out.println("------------------------------------------------\n");

		// Provo a rimuovere una prenotazione non esistente
		boolean remove2 = campo.removePren(14, 15, "Paolo");
		System.out.println("Rimozione prenotazione Paolo 14-15 (inesistente): "
				+ (remove2 ? "Riuscita" : "Fallita - Prenotazione non trovata"));
		System.out.println(campo);
		System.out.println("------------------------------------------------\n");

		// Percentuale di utilizzo del campo
		double utilizzo = campo.utilizzo();
		System.out.printf("Percentuale di utilizzo del campo: %.2f%%\n", utilizzo);

		System.out.println("\n---- Fine test prenotazioni ----");
	}
}