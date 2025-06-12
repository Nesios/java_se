package day_10.forma;

public class Quadrato extends Forma {
	private double raggioLato;
	public double perimetroCirconferenza (double raggioLAto) {
		return raggioLato*4;
		
	}
	public double area (double raggioLato) {
		return Math.pow(raggioLato, 2);
	}
}
