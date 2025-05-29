package day_06;

import java.util.Scanner;

public class CongetturaCollatz {

public static voidmain(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	int passi = 0; // conta il numero di passi
	
	System.out.println("Inserisci il numero iniziale ");
	
	//ciclo che porta ad uno come risultato finale
	
	int numero = scanner.nextInt();
	while (numero != 1) {
		if (numero % 2 == 0) {
			numero /= 2; //sarebbe come scrivere numero = numero / 2
		}
		else {
			numero = 3 * numero + 1;
		}
		passi++;
		System.out.println(numero);
	}
	System.out.println("Numero di passi per risolvere la congettura " + passi);
	scanner.close();
}
