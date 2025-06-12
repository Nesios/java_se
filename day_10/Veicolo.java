package day_10;

public class Veicolo {

	private String numeroTarga;
	private String nome;
	private String modello;
	public Veicolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Veicolo(String numeroTarga, String nome, String modello) {
		super();
		this.numeroTarga = numeroTarga;
		this.nome = nome;
		this.modello = modello;
	}
	@Override
	public String toString() {
		return "Veicolo [numeroTarga=" + numeroTarga + ", nome=" + nome + ", modello=" + modello + "]";
	}
	
	}

