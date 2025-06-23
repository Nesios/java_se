package day_17.ArchivioMusicale;

public class Album {
    private String titolo;

    public Album(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return titolo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Album)) return false;
        Album altro = (Album) obj;
        return titolo.equalsIgnoreCase(altro.titolo);
    }

    @Override
    public int hashCode() {
        return titolo.toLowerCase().hashCode();
    }
}