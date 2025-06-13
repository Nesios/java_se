package day_17.jdbc.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
private int id;
private String CF;
private String nome;
private String cognome;
private LocalDateTime data_nascita;

public Persona() {
    super();
}

public Persona(int id, String CF, String nome, String cognome, LocalDateTime data_nascita) {
    this.id = id;
    this.CF = CF;
    this.nome = nome;
    this.cognome = cognome;
    this.data_nascita = data_nascita;
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

public void setCF(java.lang.String CF) {
    this.CF = CF;
}

public String getNome() {
    return nome;
}

public void setNome(java.lang.String nome) {
    this.nome = nome;
}

public String getCognome() {
    return cognome;
}

public void setCognome(java.lang.String cognome) {
    this.cognome = cognome;
}

public LocalDateTime getData_nascita() {
    return data_nascita;
}

public void setData_nascita(LocalDateTime data_nascita) {
    this.data_nascita = data_nascita;
}

@Override
public String toString() {
    return "Persona{" +
            "id=" + id +
            ", CF='" + CF + '\'' +
            ", nome='" + nome + '\'' +
            ", cognome='" + cognome + '\'' +
            ", data_nascita=" + data_nascita +
            '}';
}
}