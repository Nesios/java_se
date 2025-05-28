package day_05;

import java.util.Scanner;

public class InvertiData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci la stringa da invertire");
		String str = input.nextLine();
		// Tennis
		// 012345

		String invertita = ""; // Inizializzazione stringa vuota
		for (int i = str.length() - 1; i >= 0; i--) {
			invertita = invertita + str.charAt(i); // invertita += str.charat(i)
		}

		System.out.println("stringa invertita: " + invertita);
		input.close();
	}

}
