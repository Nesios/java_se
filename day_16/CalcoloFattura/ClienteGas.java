package day_16.CalcoloFattura;

import java.math.BigDecimal;

public class ClienteGas extends Cliente {

	private double m3;
	private BigDecimal prezzoM3;

	public ClienteGas() {
		super();
	}

	public ClienteGas(String cf, String nome, String cognome, double m3) {
		super(cf, nome, cognome);
		this.m3 = m3;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	public BigDecimal getPrezzoM3() {
		return prezzoM3;
	}

	public void setPrezzoM3(BigDecimal prezzoM3) {
		this.prezzoM3 = prezzoM3;
	}

	@Override
	public String toString() {
		return "ClienteGas" + super.toString() + "+[m3=" + m3 + ", prezzoM3=" + prezzoM3 + "]";
	}

}