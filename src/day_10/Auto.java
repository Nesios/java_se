package day_10;

public class Auto extends Veicolo {
	private boolean haRoulotte;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String numeroTarga, String nome, String modello, boolean haRoulotte) {
		super(numeroTarga, nome, modello);
		this.haRoulotte = haRoulotte;
	}

	@Override
	public String toString() {
		return "Auto ["+super.toString()+"haRoulotte=" + haRoulotte + "]";
	}

}
