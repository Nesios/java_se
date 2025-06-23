package day_17.ArchivioMusicale;

public class Brano {
    private String titolo;
    private Artista artista;
    private Album album;
    private Genere genere;

    public Brano(String titolo, Artista artista, Album album, Genere genere) {
        this.titolo = titolo;
        this.artista = artista;
        this.album = album;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public Artista getArtista() {
        return artista;
    }

    public Album getAlbum() {
        return album;
    }

    public Genere getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo +
               ", Artista: " + artista.getNome() +
               ", Album: " + album.getTitolo() +
               ", Genere: " + genere.getNome();
    }
}