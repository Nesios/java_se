package day_17.ArchivioMusicale;

public class Artista {
    private String nome;

    public Artista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artista)) return false;
        Artista altro = (Artista) obj;
        return nome.equalsIgnoreCase(altro.nome);
    }

    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode();
    }
}