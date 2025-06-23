package day_17.ArchivioMusicale;

public class TestArchivio {
    public static void main(String[] args) {
        Archivio archivio = new Archivio();

        // Parametri: nome brano, artista, album, anno, genere)
        archivio.aggiungiBrano("Like a Rolling Stone", "Bob Dylan", "Highway 61 Revisited", 1965, "Rock");
        archivio.aggiungiBrano("(I Can't Get No) Satisfaction", "Rolling Stones", "Out of Our Heads", 1965, "Rock");
        archivio.aggiungiBrano("Imagine", "John Lennon", "Imagine", 1971, "Pop");
        archivio.aggiungiBrano("What's Going On", "Marvin Gaye", "What's Going On", 1971, "Soul");
        archivio.aggiungiBrano("Respect", "Aretha Franklin", "I Never Loved a Man", 1967, "Soul");
        archivio.aggiungiBrano("Good Vibrations", "The Beach Boys", "Smiley Smile", 1966, "Pop");
        archivio.aggiungiBrano("Johnny B. Goode", "Chuck Berry", "Chuck Berry Is On Top", 1958, "Rock");
        archivio.aggiungiBrano("Hey Jude", "The Beatles", "Hey Jude", 1968, "Rock");
        archivio.aggiungiBrano("Smells Like Teen Spirit", "Nirvana", "Nevermind", 1991, "Grunge");
        archivio.aggiungiBrano("What'd I Say", "Ray Charles", "What'd I Say", 1959, "Blues");

        // Stampo tutto l'archivio
        System.out.println(archivio);
    }
}