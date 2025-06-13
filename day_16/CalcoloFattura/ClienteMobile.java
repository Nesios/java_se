package day_16.CalcoloFattura;

public class ClienteMobile extends Cliente {
	private int giga;

	public ClienteMobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteMobile(String cf, String nome, String cognome, int giga) {
		super(cf, nome, cognome);
		this.giga = giga;// TODO Auto-generated constructor stub
	}

	public int getGiga() {
		return giga;
	}

	public void setGiga(int giga) {
		this.giga = giga;
	}

	@Override
	public String toString() {
		return "ClienteMobile ["+super.toString()+" giga=" + giga + "]";
	}

}
