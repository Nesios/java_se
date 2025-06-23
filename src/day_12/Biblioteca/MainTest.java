package day_12.Biblioteca;

public class MainTest {
    public static void main(String[] args) {
        // Creo l'archivio
        Archivio archivio = new Archivio();

        // Creo abbonati
        Abbonato federica = new Abbonato("Federica", "Perez");
        Abbonato lorenzo = new Abbonato("Lorenzo", "Bianchi");

        // Creo libri
        Libro libro1984 = new Libro("1984");
        Libro libroGiardinodeiCiliegi = new Libro("Il giardino dei ciliegi");

        // Aggiungo abbonati e libri all'archivio
        archivio.aggiungiAbbonato(federica);
        archivio.aggiungiAbbonato(lorenzo);
        archivio.aggiungiLibro(libro1984);
        archivio.aggiungiLibro(libroGiardinodeiCiliegi);

        // Stampo lo stato iniziale dei libri
        System.out.println("Stato iniziale dei libri:");
        archivio.stampaLibri();

        // Provo a prestare "1984" a Federica fino al 29/05/2025
        boolean prestito1 = archivio.presta(libro1984, federica, new Data(29, 5, 2025));
        System.out.println("\nPrestito effettuato? " + prestito1);
        archivio.stampaLibri();

        // Provo a prestare di nuovo "1984" a Lorenzo (dovrebbe fallire perché è già prestato)
        boolean prestito2 = archivio.presta(libro1984, lorenzo, new Data(30, 6, 2025));
        System.out.println("\nSecondo prestito riuscito? " + prestito2);
        archivio.stampaLibri();

        // Restituisco "1984"
        archivio.restituisci(libro1984);
        System.out.println("\nDopo restituzione:");
        archivio.stampaLibri();

        // Ora riprovo a prestare "1984" a Lorenzo (dovrebbe funzionare)
        boolean prestito3 = archivio.presta(libro1984, lorenzo, new Data(30, 6, 2025));
        System.out.println("\nPrestito dopo restituzione? " + prestito3);
        archivio.stampaLibri();

        // Prestito "Il giardino dei ciliegi" a Federica
        boolean prestitoGiardino = archivio.presta(libroGiardinodeiCiliegi, federica, new Data(15, 6, 2025));
        System.out.println("\nPrestito Il giardino dei ciliegi a Federica? " + prestitoGiardino);
        archivio.stampaLibri();
    }
}