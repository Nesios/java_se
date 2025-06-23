package day_18;

public class Eccezioni {
	public static void main(String args[])

	{
		try {
			int a = 0;
			String s = args[0];
			a = Integer.parseInt(s);
			System.out.println("a: " + a); // Questa riga di codice in caso di eccezione non viene eseguita
		} catch (NumberFormatException e) {
			System.out.println("Valore non convertibile");
		} catch (Exception e) {
			System.out.println("Se l'eccezione non venisse gestita dal catch precedente comunque verrebbe gestita qui");
		}
		System.out.println("Se il programma non termina questa frase verrà sempre scritta");

	}
}
