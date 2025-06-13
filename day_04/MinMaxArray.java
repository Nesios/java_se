package day_04;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] numeri = {5, 2, 9, -3, 7, 10, 0};
		
		// Inizializziamo min e max con il primo valore dell'array
		int min = numeri[0];
		int max = numeri[0];
		
		// Scorriamo l'array per trovare min e max
		for (int i = 1; i < numeri.length; i++) {
			if (numeri[i] < min) {
				min = numeri[i];
			}
			if (numeri[i] > max) {
				max = numeri[i];
			}
		}
		
		System.out.println("Valore minimo: " + min);
		System.out.println("Valore massimo: " + max);
	}

}