package day_12.Biblioteca;

public class Libro {
	private String titolo;
	private Abbonato utente; // Chi ha preso il libro, null se disponibile
	private Data dataScadenza; // Data di scadenza del prestito, null se disponibile
	private boolean prestato; // true se il libro è in prestito, false se disponibile

	public Libro(String titolo) {
		this.titolo = titolo;
		this.utente = null;
		this.dataScadenza = null;
		this.prestato = false;
	}

	public String getTitolo() {
		return titolo;
	}

	public Abbonato getUtente() {
		return utente;
	}

	public Data getDataScadenza() {
		return dataScadenza;
	}

	public boolean isPrestato() {
		return prestato;
	}

	public boolean prestaLibro(Abbonato utente, Data dataScadenza) {
		if (!prestato) {
			this.utente = utente;
			this.dataScadenza = new Data(dataScadenza); // copia per sicurezza
			this.prestato = true;
			return true; // Prestito effettuato con successo
		}
		return false; // Libro già prestato
	}

	public void restituisciLibro() {
		this.utente = null;
		this.dataScadenza = null;
		this.prestato = false;
	}

	public String toString() {
		if (prestato) {
			return "\"" + titolo + "\" - Prestato a " + utente.getCognome() + " " + utente.getNome() + " fino al "
					+ dataScadenza.toString();
		} else {
			return "\"" + titolo + "\" - Disponibile";
		}
	}
}