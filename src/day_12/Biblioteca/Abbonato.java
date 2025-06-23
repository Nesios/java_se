package day_12.Biblioteca;

public class Abbonato {
    private String nome;
    private String cognome;

    public Abbonato(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String toString() {
        return cognome + " " + nome;
    }
}