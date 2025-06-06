package day_03;

import java.util.Scanner;

/*
 * Esercizio 05
 * Scrivere il proprio nome sullo schermo
 * Scrivere un programma che visualizzi sullo schermo del terminale il vostro
 * nome all’interno di un rettangolo.
 */

public class CorniceNome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome: ");
		String nome = scanner.nextLine();
		
		int lunghezza = nome.length();
		
		// Stampa la prima riga con il + e i trattini
        System.out.print("+");
        for (int i = 0; i < lunghezza + 2; i++) {
            System.out.print("-");
            
        }
        System.out.println("+");
        
        //Riga centrale con il nome
        System.out.println("| " + nome + " |");

        // Stampa la terza riga come la prima
        System.out.print("+");
        for (int i = 0; i < lunghezza + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        scanner.close();
	}

}