package day_17.ArchivioMusicale;

public class Genere {
    private String nome;

    public Genere(String nome) {
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
        if (!(obj instanceof Genere)) return false;
        Genere altro = (Genere) obj;
        return nome.equalsIgnoreCase(altro.nome);
    }

    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode();
    }
}