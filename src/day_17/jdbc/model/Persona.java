package day_17.jdbc.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Non strettamente necessario per questa classe, ma può rimanere

public class Persona {
    private int id;
    private String CF;
    private String nome;
    private String cognome;
    private LocalDateTime dataNascita; // Modificato da data_nascita a dataNascita

    public Persona() {
        super();
    }

    public Persona(int id, String CF, String nome, String cognome, LocalDateTime dataNascita) {
        this.id = id;
        this.CF = CF;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita; // Modificato
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) { // Rimosso java.lang.String, è implicito
        this.CF = CF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { // Rimosso java.lang.String, è implicito
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) { // Rimosso java.lang.String, è implicito
        this.cognome = cognome;
    }

    public LocalDateTime getDataNascita() { // Modificato da getData_nascita a getDataNascita
        return dataNascita;
    }

    public void setDataNascita(LocalDateTime dataNascita) { // Modificato da setData_nascita a setDataNascita
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", CF='" + CF + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita + // Modificato
                '}';
    }
}