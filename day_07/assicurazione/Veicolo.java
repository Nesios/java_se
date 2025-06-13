package day_07.assicurazione;

public class Veicolo {

    private String targa;
    private Cliente proprietario;

    public Veicolo() {

        super();
        // TODO Auto-generated constructor stub

        // Generate constructors from superclass
    }

    public Veicolo(String targa, Cliente proprietario) {
        super();
        this.targa = targa;
        this.proprietario = proprietario;

        // Generate construct from Fields
    }

    public String getTarga() {
        return targa;
    }

    // Generate Getters and Setters
    public void setTarga(String targa) {
        this.targa = targa;
    }

    // Generate toString()...
    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", proprietario=" + proprietario + "]";
    }

}