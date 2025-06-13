package day_07.assicurazione;

import java.time.LocalDate;

public class Cliente {

    private String codiceFiscale;
    private String nome;
    private String cognome;
    private LocalDate nascita;

    // Costruttore di default (senza argomenti)
    public Cliente() {
        super(); // Chiama il costruttore della superclasse (Object in questo caso)
    }

    // Costruttore parametrico
    public Cliente(String codiceFiscale, String nome, String cognome, LocalDate nascita) {
        super(); // Chiama il costruttore della superclasse
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
    }

    // Metodi Getter
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    // Metodi Setter
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNascita(LocalDate nascita) {
        this.nascita = nascita;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return "Cliente [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", nascita="
                + nascita + "]";
    }
}