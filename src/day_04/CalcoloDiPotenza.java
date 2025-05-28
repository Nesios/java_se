package day_04;

public class CalcoloDiPotenza {

	public static void main(String[] args) {}

	// Esercizio_05: Calcolo della potenza di un numero Scrivi un programma Java che
	// calcola la potenza di un numero base elevato a un esponente dato.
		
	import java.util.Scanner;

	Scanner scanner = new Scanner(System.in); System.out.print("Inserisci un numero:");
	double numero = scanner.nextDouble();

	System.out.print("inserisci il numero a cui elevarlo:");
	int potenza = scanner.nextInt();

	double risultato = 1;for(
	int i = 0;i<potenza;i++)
	{
		risultato = risultato * numero;
	}System.out.println("risultato: "+risultato);scanner.close();
}}}

}
