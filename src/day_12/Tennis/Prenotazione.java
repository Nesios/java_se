package day_12.Tennis;

public class Prenotazione {
	private String nomeCliente;
	private int inizio; // ora di inizio prenotazione (ad esempio in formato 24h, tipo 14 per le 14:00)
	private int fine; // ora di fine prenotazione

	public Prenotazione(String nomeCliente, int inizio, int fine) {
		this.nomeCliente = nomeCliente;
		this.inizio = inizio;
		this.fine = fine;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getInizio() {
		return inizio;
	}

	public int getFine() {
		return fine;
	}

	// Metodo per verificare se due prenotazioni si sovrappongono
	public boolean siSovrappone(Prenotazione altra) {
		// Due intervalli si sovrappongono se l'inizio di uno è prima della fine
		// dell'altro e viceversa
		return this.inizio < altra.fine && altra.inizio < this.fine;
	}

	@Override
	public String toString() {
		return "Prenotazione di " + nomeCliente + " dalle " + inizio + " alle " + fine;
	}
}