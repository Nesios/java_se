package day_12.Biblioteca;

public class TestAbbonato {

	public static void main(String[] args) {
		Abbonato a1 = new Abbonato("Federica", "Perez");

		System.out.println("Nome: " + a1.getNome());
		System.out.println("Cognome: " + a1.getCognome());
		System.out.println("Abbonato: " + a1);
	}
}