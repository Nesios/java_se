package day_07.Biblioteca;

import java.time.LocalDateTime;

public class ArchivioController {
	private static Prestito[] prestiti = new Prestito[100];
	private static Libro[] libri = new Libro[100];
	private static Abbonato[] abbonati = new Abbonato[100];

	public static String nuovoLibro(Libro libro) {

		for (int i = 0; i < libri.length; i++) {
			if (libri[i] == null) {
				libri[i] = libro;
				return "Libro inserito con successo";
			}
		}
		return "Database pieno, non e stato possibile inserire il nuovo libro";
	}

	public static String nuovoAbbonato(Abbonato abbonato) {

		for (int i = 0; i < abbonati.length; i++) {
			if (abbonati[i] == null) {
				abbonati[i] = abbonato;
				return "Utente inserito con successo";
			}
		}
		return "Database pieno, non e stato possibile inserire il nuovo Utente";
	}

	public static String trovaAbbonato(Abbonato abbonato) {

		for (int i = 0; i < abbonati.length; i++) {
			if (abbonati[i].equals(abbonato)) {
				return "Utente presente in anagrafica";
			}
		}
		// nuovoAbbonato(abbonato);
		return "Utente non presente in anagrafica";
	}

//Abbonato abbonato, Libro libro, LocalDateTime dataPrestito
	public static String prestito(Abbonato abbonato, Libro libro, LocalDateTime dataPrestito) {
		Prestito prestito = new Prestito(abbonato, libro, dataPrestito);

		for (int i = 0; i < prestiti.length; i++) {
			if (prestiti[i].getLibro().getIsbn() == libro.getIsbn()) {
				return "Libro gia in prestito";
			}
		}
		for (int i = 0; i < prestiti.length; i++) {
			if (prestiti[i] == null) {
				prestiti[i] = prestito;
				return "Prestito effettuato con successo";
			}
		}
		return "impossibile effettuare il prestito";
	}

	public static String restituzione(Abbonato abbonato, Libro libro) {
		if (abbonato != null && libro != null) {
			for (int i = 0; i < prestiti.length; i++) {
				if (prestiti[i].getAbbonato().getCf() == abbonato.getCf()
						&& prestiti[i].getLibro().getIsbn() == libro.getIsbn()) {
					prestiti[i] = null;
					return "Prestito chiuso";
				}
			}
		}
		return "Prestito non trovato";
	}

	public static int libriInPrestito() {
		return prestiti.length;
	}
}