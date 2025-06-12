day_06;

/*Stampa gli elementi di una matrice ,
scrivi un programma java per stampare gli elementi di una matrice.
*/
public class StampareElementiMatrice{

public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };					// modo alternativo 1
		int[] arr3 = { 7, 8, 9 };
		int[][] arrCont = { arr1, arr2, arr3 };   	// modo alternativo 2
		int[][] matrice = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int riga = 0; riga < matrice.length; riga++) {
			for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
				System.out.print(matrice[riga][colonna] + " ");
			}
			System.out.println();
		}
	}
}