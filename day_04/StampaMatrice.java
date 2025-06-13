package day_04;

public class StampaMatrice {

	public static void main(String[] args) {

		// Definiamo una matrice 3x3
		int[][] matrice = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		// Cicliamo su ogni riga
		for (int i = 0; i < matrice.length; i++) {
			// Cicliamo su ogni colonna della riga i
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			// Dopo ogni riga, facciamo andare a capo
			System.out.println();
		}

	}

}