package day_04; // <--- AGGIUNTO: la dichiarazione del package

/*
 * Stampa gli elementi di una matrice:
 * Scrivi un programma Java per stampare gli elementi di una matrice.
 */
public class StampareElementiMatrice {

    public static void main(String[] args) {
        // Questi sono modi alternativi per creare la stessa matrice.
        // Puoi scegliere il più leggibile per te o quello che si adatta meglio al contesto.
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = { 7, 8, 9 };
        int[][] arrCont = { arr1, arr2, arr3 }; // Questo è un modo per costruire una matrice da array preesistenti

        // Questo è il modo più comune e diretto per inizializzare una matrice 2D
        int[][] matrice = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Ciclo annidato per stampare gli elementi della matrice
        // Il ciclo esterno itera sulle righe
        for (int riga = 0; riga < matrice.length; riga++) {
            // Il ciclo interno itera sulle colonne della riga corrente
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                System.out.print(matrice[riga][colonna] + " "); // Stampa l'elemento seguito da uno spazio
            }
            System.out.println(); // Va a capo alla fine di ogni riga per una stampa ordinata
        }

        // Nota: Puoi rimuovere le dichiarazioni di arr1, arr2, arr3 e arrCont
        // se non le usi effettivamente e vuoi mantenere il codice più pulito,
        // dato che stai usando 'matrice' per la stampa.
        // Le ho lasciate per mostrare i "modi alternativi" come hai fatto tu.
    }
}