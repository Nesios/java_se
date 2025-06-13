package day_16.CalcoloFattura;

public class ClienteFisso extends Cliente {

//public enum Contratto{STANDARD , SPECIAL ,SUPERSPECIAL};

	private ContrattoFisso contratto;

	public ClienteFisso() {
		super();
	}

	public ClienteFisso(String cf, String nome, String cognome, ContrattoFisso contratto) {
		super(cf, nome, cognome);
		this.contratto = contratto;
	}

	public ContrattoFisso getContratto() {
		return contratto;
	}

	public void setContratto(ContrattoFisso contratto) {
		this.contratto = contratto;
	}

	@Override
	public String toString() {
		return "ClienteFisso [" + super.toString() + " contratto= " + contratto + "]";
	}

}