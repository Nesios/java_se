package day_06;

import java.util.Scanner;

public class VerificaNumeroPrimo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numero positivo > 1:"); // Corretto: println e aggiunta : per chiarezza
        int num = input.nextInt();
        boolean isPrimo = true;

        if (num <= 1) {
            isPrimo = false;
        } else {
            // Il ciclo può essere ottimizzato controllando fino alla radice quadrata di num
            // for (int i = 2; i <= Math.sqrt(num); i++) {
            for (int i = 2; i < num; i++) { // Ciclo originale dell'utente
                if (num % i == 0) {
                    isPrimo = false;
                    break; // Corretto: aggiunto ;
                }
            }
        }

        // Spostato qui per stampare sempre il risultato
        System.out.println("Numero: " + num + " " + (isPrimo ? "è primo" : "non è primo")); // Corretto: println e aggiunto uno spazio

        input.close(); // Buona pratica chiudere lo scanner
    } // Chiusura del metodo main
} // Chiusura della classe VerificaNumeroPrimo