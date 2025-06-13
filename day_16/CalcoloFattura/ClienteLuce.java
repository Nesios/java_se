package day_16.CalcoloFattura;

import java.math.BigDecimal;

public class ClienteLuce extends Cliente {

	private double kwh;// quantita di consumo wkh
	private BigDecimal prezzoKwh;// prezzo da pagare in base al consumo

	public ClienteLuce() {
		// viene chiamato il costruttore di default dela classe padre
		super();
	}

	public ClienteLuce(String cf, String nome, String cognome, double kwh) {
		// costruttoreparametrico
		super(cf, nome, cognome);
		this.kwh = kwh;
	}

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	public BigDecimal getPrezzoKwh() {
		return prezzoKwh;
	}

	public void setPrezzoKwh(BigDecimal prezzoKwh) {
		this.prezzoKwh = prezzoKwh;
	}

	@Override
	public String toString() {
		return "ClienteLuce" + super.toString() + "[kwh=" + this.kwh + ", prezzoKwh=" + this.prezzoKwh + "]";
	}

}