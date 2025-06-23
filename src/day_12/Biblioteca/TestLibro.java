package day_12.Biblioteca;

public class TestLibro {
	public static void main(String[] args) {
		Libro libro = new Libro("1984");
		Abbonato utente = new Abbonato("Federica", "Perez");
		Data scadenza = new Data(29, 5, 2025);

		System.out.println(libro + "\n"); // "1984" - Disponibile

		boolean prestitoEffettuato = libro.prestaLibro(utente, scadenza);
		System.out.println("Prestito effettuato? " + prestitoEffettuato + "\n");
		System.out.println(libro + "\n"); // "1984" - Prestato a Perez Federica fino al 29/05/2025

		// Proviamo a prestare di nuovo lo stesso libro senza restituirlo
		boolean secondoPrestito = libro.prestaLibro(new Abbonato("Mario", "Rossi"), new Data(30, 6, 2025));
		System.out.println("Secondo prestito riuscito? " + secondoPrestito + "\n"); // dovrebbe stampare false

		libro.restituisciLibro();
		System.out.println(libro + "\n"); // "1984" - Disponibile

		// Ora il libro è disponibile, proviamo a prestarlo di nuovo
		boolean prestitoDopoRestituzione = libro.prestaLibro(new Abbonato("Mario", "Rossi"), new Data(30, 6, 2025));
		System.out.println("Prestito dopo restituzione? " + prestitoDopoRestituzione); // true
		System.out.println(libro);
	}
}