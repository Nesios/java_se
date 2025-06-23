package day_17.jdbc.control;

import java.time.LocalDateTime;
import java.util.List;

import day_17.jdbc.model.Persona;
// Corretto il package da 'persistenza' a 'persistence'
import day_17.jdbc.persistence.DAOException;
import day_17.jdbc.persistence.PersonaDAO;
import day_17.jdbc.persistence.impl.PersonaDAOImpl;

public class Main {
	private static PersonaDAO personaDAO = new PersonaDAOImpl();

	public static void main(String[] args) {
		// Esegui i metodi in sequenza per testare le operazioni CRUD complete
		save();
		System.out.println("\n--- Dopo Save ---");
		findById(1); // Assicurati che l'ID 1 esista o sia quello generato
		
		System.out.println("\n--- Aggiornamento ---");
		update(); // Test per l'aggiornamento, prova a cambiare l'ID se non trovi il 34
		
		System.out.println("\n--- Trova Tutto ---");
		findAll();
		
		System.out.println("\n--- Trova per Nome ---");
		findByNome("Fortunato_UPDATED"); // Usa il nome aggiornato per test
		
		System.out.println("\n--- Trova per Cognome ---");
		findByCognome("Fortunino_UPDATED"); // Usa il cognome aggiornato per test
		
		System.out.println("\n--- Conteggio ---");
		count();
		
		System.out.println("\n--- Trova per CF ---");
		findByCF("CF1_UPDATED"); // Usa il CF aggiornato per test
		
		System.out.println("\n--- Trova per Anno ---");
		findByAnno("2001"); // Usa l'anno aggiornato per test
		
		System.out.println("\n--- Eliminazione ---");
		delete(1); // Elimina la persona con ID 1 dopo tutti i test
		System.out.println("\n--- Verifica dopo Eliminazione ---");
		findById(1); // Verifica che non esista più
	}

	private static void save() {
		try {
			System.out.println("=== Save ===");
			Persona persona = new Persona();
			persona.setCF("CF1");
			persona.setNome("Fortunato");
			persona.setCognome("Fortunino");
			persona.setDataNascita(LocalDateTime.of(2000, 1, 1, 0, 0, 1));
			personaDAO.save(persona);
			System.out.println("Persona salvata con ID: " + persona.getId()); // Mostra l'ID generato
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante il salvataggio!");
			e.printStackTrace(); // Stampa l'intero stack trace per il debug
		}
	}

	private static Persona findById(int id) {
		Persona persona = null;
		try {
			System.out.println("=== Find By Id ===");
			persona = personaDAO.findById(id);
			if (persona != null) {
				System.out.println(persona);
			} else {
				System.out.println("Nessuna persona trovata con ID: " + id);
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante la ricerca per ID!");
			e.printStackTrace();
		}
		return persona;
	}

	private static void delete(int id) {
		try {
			System.out.println("=== Delete ===");
			personaDAO.delete(id);
			System.out.println("Persona con ID " + id + " eliminata con successo.");
		} catch (DAOException e) {
			System.err.println("Ops... si è verificato un errore durante l'eliminazione!");
			e.printStackTrace();
		}
	}

	private static Persona findByCF(String CF) {
		Persona persona = null;
		try {
			System.out.println("=== Find By CF ===");
			persona = personaDAO.findByCF(CF);
			if (persona != null) {
				System.out.println(persona);
			} else {
				System.out.println("Nessuna persona trovata con CF: " + CF);
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante la ricerca per CF!");
			e.printStackTrace();
		}
		return persona;
	}

	private static List<Persona> findByNome(String nome) {
		List<Persona> persone = null;
		try {
			System.out.println("=== Find By Nome ===");
			persone = personaDAO.findByNome(nome);
			if (persone != null && !persone.isEmpty()) {
				persone.forEach(System.out::println);
			} else {
				System.out.println("Nessuna persona trovata con nome: " + nome);
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante la ricerca per nome!");
			e.printStackTrace();
		}
		return persone;
	}

	private static List<Persona> findByCognome(String cognome) {
		List<Persona> persone = null;
		try {
			System.out.println("=== Find By Cognome ===");
			persone = personaDAO.findByCognome(cognome);
			if (persone != null && !persone.isEmpty()) {
				persone.forEach(System.out::println);
			} else {
				System.out.println("Nessuna persona trovata con cognome: " + cognome);
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante la ricerca per cognome!");
			e.printStackTrace();
		}
		return persone;
	}

	private static List<Persona> findAll() {
		List<Persona> persone = null;
		try {
			System.out.println("=== Find All ===");
			persone = personaDAO.findAll();
			if (persone != null && !persone.isEmpty()) {
				persone.forEach(System.out::println);
			} else {
				System.out.println("Nessuna persona trovata nel database.");
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante la ricerca di tutte le persone!");
			e.printStackTrace();
		}
		return persone;
	}

	private static long count() {
		long count = 0;
		try {
			System.out.println("=== Count ===");
			count = personaDAO.count();
			System.out.println("Numero totale di persone: " + count);
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante il conteggio!");
			e.printStackTrace();
		}
		return count;
	}

	private static List<Persona> findByAnno(String annoNascita) {
		List<Persona> persone = null;
		try {
			System.out.println("=== Find By Anno Nascita ===");
			persone = personaDAO.findByAnno(annoNascita);
			if (persone != null && !persone.isEmpty()) {
				persone.forEach(System.out::println);
			} else {
				System.out.println("Nessuna persona trovata per l'anno di nascita: " + annoNascita);
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante la ricerca per anno di nascita!");
			e.printStackTrace();
		}
		return persone;
	}

	private static void update() {
		try {
			System.out.println("=== Update ===");
			// Cerca la persona con ID 1 (quella che abbiamo salvato all'inizio)
			Persona persona = personaDAO.findById(1); 
			if (persona != null) {
				persona.setCF("CF1_UPDATED");
				persona.setNome("Fortunato_UPDATED");
				persona.setCognome("Fortunino_UPDATED");
				persona.setDataNascita(LocalDateTime.of(2001, 3, 5, 6, 5, 0)); 
				personaDAO.update(persona);
				System.out.println("Persona aggiornata con successo: " + persona);
			} else {
				System.out.println("Nessuna persona trovata con ID 1 per l'aggiornamento. Eseguire prima il save.");
			}
		} catch (DAOException e) {
			System.err.println("Ops...si è verificato un errore durante l'aggiornamento!");
			e.printStackTrace();
		}
	}
}