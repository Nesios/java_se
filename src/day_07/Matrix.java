package day_07;

public class Matrix {

	public static void main(String[] args) {
		String input = "9 8 7\n" + "5 3 2\n" + "6 6 7";

		// Spezza in righe
		String[] righe = input.split("\n");

		// Crea matrice
		int numRighe = righe.length;
		int numColonne = righe[0].split(" ").length;
		int[][] matrice = new int[numRighe][numColonne];

		// Popola matrice
		for (int i = 0; i < numRighe; i++) {
			String[] valori = righe[i].split(" ");
			for (int j = 0; j < numColonne; j++) {
				matrice[i][j] = Integer.parseInt(valori[j]);
			}
		}

		// Stampa righe
		System.out.println("Righe:");
		for (int i = 0; i < numRighe; i++) {
			for (int j = 0; j < numColonne; j++) {
				System.out.print(matrice[i][j]);
				if (j < numColonne - 1)
					System.out.print(", ");
			}
			System.out.println();
		}

		// Stampa colonne
		System.out.println("\nColonne:");
		for (int j = 0; j < numColonne; j++) {
			for (int i = 0; i < numRighe; i++) {
				System.out.print(matrice[i][j]);
				if (i < numRighe - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	}
}