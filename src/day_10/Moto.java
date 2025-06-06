package day_10;

public class Moto extends Veicolo{
	private boolean haSidecar;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String numeroTarga, String nome, String modello, boolean haSidecar) {
		super(numeroTarga, nome, modello);
		this.haSidecar = haSidecar;
	}

	@Override
	public String toString() {
		return "Moto ["+super.toString()+"haSidecar=" + haSidecar + "]";
	}

}