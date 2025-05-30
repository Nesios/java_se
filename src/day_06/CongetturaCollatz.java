package day_06;

import java.util.Scanner;

public class CongetturaCollatz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passi = 0; // Conta il numero di passi

        System.out.println("Inserisci un numero intero positivo per avviare la Congettura di Collatz:");

        // Assicuriamoci che l'utente inserisca un numero intero valido
        while (!scanner.hasNextInt()) {
            System.out.println("Input non valido. Per favore, inserisci un numero intero.");
            scanner.next(); // Consuma l'input non valido per evitare un loop infinito
        }
        int numero = scanner.nextInt();

        // Controlliamo che il numero sia positivo, dato che la congettura si applica ai numeri interi positivi
        if (numero <= 0) {
            System.out.println("La Congettura di Collatz si applica solo ai numeri interi positivi. Riprova con un numero maggiore di zero.");
            scanner.close();
            return; // Termina il programma
        }
        
        System.out.println("Sequenza di Collatz per " + numero + ":");
        // Ciclo che porta ad uno come risultato finale
        while (numero != 1) {
            if (numero % 2 == 0) {
                numero /= 2; // Equivalente a numero = numero / 2
            } else {
                numero = 3 * numero + 1;
            }
            passi++;
            System.out.println(numero); // Stampa il numero corrente dopo ogni passo
        }
        
        System.out.println("---"); // Separatore per chiarezza
        System.out.println("Numero di passi totali per raggiungere 1: " + passi);
        scanner.close();
    }
}