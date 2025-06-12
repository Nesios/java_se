package day_14;

public class Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 9, 8, 7, 2 }, // matrix[0]
				{ 5, 3, 2 }, // matrix[1]
				{ 6, 6, 7, 1, 4 } // matrix[2]
		};

		// Stampa della matrice riga per riga
		System.out.println("Matrice originale:");
		for (int riga = 0; riga < matrix.length; riga++) {
			for (int colonna = 0; colonna < matrix[riga].length; colonna++) {
				System.out.print(matrix[riga][colonna] + " ");
			}
			System.out.println();
		}

		System.out.println("-----");

		// Trova il numero massimo di colonne tra tutte le righe
		int maxColonne = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length > maxColonne) {
				maxColonne = matrix[i].length;
			}
		}

		// Stampa della matrice "trasposta"
		// Per ogni colonna logica (finta riga nella trasposta)
		System.out.println("Matrice trasposta:");
		for (int colonna = 0; colonna < maxColonne; colonna++) {
			for (int riga = 0; riga < matrix.length; riga++) {
				// Controlla che la colonna esista nella riga corrente
				if (colonna < matrix[riga].length) {
					System.out.print(matrix[riga][colonna] + " ");
				} else {
					System.out.print("  "); // spazio vuoto per allineamento
				}
			}
			System.out.println();
		}
	}
}