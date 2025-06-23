package day_12.Biblioteca;

import java.util.ArrayList;

public class Archivio {
	// Lista di libri e abbonati (privati)
	private ArrayList<Libro> libri;
	private ArrayList<Abbonato> abbonati;

	// Costruttore senza parametri
	public Archivio() {
		libri = new ArrayList<>();
		abbonati = new ArrayList<>();
	}

	// Metodo per aggiungere un libro
	public void aggiungiLibro(Libro libro) {
		libri.add(libro);
	}

	// Metodo per aggiungere un abbonato
	public void aggiungiAbbonato(Abbonato abbonato) {
		abbonati.add(abbonato);
	}

	// Metodo per cercare un libro per titolo (ritorna null se non trovato)
	public Libro cercaLibro(String titolo) {
		for (Libro libro : libri) {
			if (libro.getTitolo().equalsIgnoreCase(titolo)) {
				return libro;
			}
		}
		return null;
	}

	// Metodo per cercare un abbonato per nome e cognome (ritorna null se non
	// trovato)
	public Abbonato cercaAbbonato(String nome, String cognome) {
		for (Abbonato abbonato : abbonati) {
			if (abbonato.getNome().equalsIgnoreCase(nome) && abbonato.getCognome().equalsIgnoreCase(cognome)) {
				return abbonato;
			}
		}
		return null;
	}

	// Metodo per prestare un libro: riceve libro, abbonato e data di scadenza
	public boolean presta(Libro libro, Abbonato abbonato, Data dataScadenza) {
		if (libro != null && abbonato != null) {
			return libro.prestaLibro(abbonato, dataScadenza);
		}
		return false;
	}

	// Metodo per restituire un libro
	public void restituisci(Libro libro) {
		if (libro != null) {
			libro.restituisciLibro();
		}
	}

	// Metodo per stampare tutti i libri con stato
	public void stampaLibri() {
		for (Libro libro : libri) {
			System.out.println(libro);
		}
	}
}