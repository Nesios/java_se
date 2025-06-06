package day_10;

public class VeicoloTest {
	public static void main(String[] args) {
		Moto honda = new Moto("ta78rga", "honda", "CBR", false);
		Auto ferrari = new Auto("fe987rr", "ferrari", "Testa Rossa", false);
		VeicoloController.stampaVeicolo(ferrari);
	}
}