package day_11;

/*La classe dell'asilo sta imparando a coltivare le piante. L'insegnante ha pensato che sarebbe stata una buona idea dare 
 * alla classe dei semi da piantare e far crescere nella terra. A questo scopo, i bambini hanno messo delle piccole tazze
lungo i davanzali delle finestre e hanno piantato un tipo di pianta in ogni tazza. I bambini hanno potuto scegliere i loro
 preferiti tra quattro tipi di semi disponibili: erba, trifoglio, ravanelli e violette.
Istruzioni
Il tuo compito è determinare, sulla base di uno schema, di quali piante è responsabile ogni bambino della classe dell'asilo.
Ci sono 12 bambini nella classe:
Alice, Bob, Charlie, David, Eve, Fred, Ginny, Harriet, Ileana, Joseph, Kincaid e Larry.
Vengono piantati quattro diversi tipi di semi:
Pianta Codifica del diagramma
Erba G
Trifoglio C
Ravanello R
Viola V
Ogni bambino riceve quattro tazze, due per ogni fila:
[window][window][window]
........................ # each dot represents a cup
........................
L'insegnante assegna le tazze ai bambini in ordine alfabetico, in base ai loro nomi, 
il che significa che Alice viene prima e Larry per ultimo.
Ecco un diagramma di esempio che rappresenta le piante di Alice:
[window][window][window]
VR......................
RG......................
Nella prima fila, più vicina alle finestre, ha una violetta e un ravanello. Nella seconda fila ha un ravanello e un po' d'erba.
Il tuo programma riceverà le piante da sinistra a destra, iniziando dalla fila più vicina alle finestre. 
Da questo, dovrebbe essere in grado di determinare quali piante appartengono a ogni studente.
Ad esempio, se viene detto che il giardino si presenta così:

[window]     [window]      [window]
0  1  2  3  4  5  6  7  8  9  10 11
VR CG VV RV CG GC CG VR GC VC GC GV=FILA1
01 23 45 67 89 
VR CC CG CR RG VC GC RV VC VG CG CV=FILA2

Quindi, se venissero richieste le piante di Alice, dovrebbe fornire:
Violette, ravanelli, violette, ravanelli
Mentre chiedere le piante di Bob produrrebbe:
Trifoglio, erba, trifoglio, trifoglio*/

import java.util.*;

public class GiardinoAsilo {

	private static final Map<Character, String> MAPPA_PIANTINE = Map.of('G', "ERBA", 'C', "TRIFOGLIO", 'R', "RAVANELLO",

			'V', "VIOLA");

// con final le costanti sono maiuscole; chiave=Charater; value=stringa;

	private static final List<String> LIST_BAMBINI = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny",

			"Harriet", "Ileana", "Joseph", "Kincaid", "Larry");// final=costante tipo pi greco; static=obblighi tutto
																// quanto

	private Map<String, List<String>> mappaBambiniPiante;

// viene dopo ad essere in un solo insieme(a condividere tutte le istanze)[la variabile è di classe e non di istanza]

	private static final int tazzaPerBambino = 2;//2 tazze per fila

	public GiardinoAsilo(String fila1, String fila2) {

		if (fila1.length() != fila2.length() || fila1.length() % 2 != 0) {

			throw new IllegalArgumentException(
					"Le righe devono avere la stessa lunghezza e contenere un numero pari di tazze.");
		}
		this.mappaBambiniPiante = new HashMap<>();// se array=String[]mappaBambiniSemi=new String[10]
		for (int i = 0; i < LIST_BAMBINI.size(); i++) { // (preincremento)++i,i++(postincremento)
			String bambino = LIST_BAMBINI.get(i);
			int indiceInizio = i * tazzaPerBambino;
			int indiceFine = indiceInizio + 1;
			List<String> piante = new ArrayList<>();// lista nomi piante associate a ciascun bambino
			piante.add(MAPPA_PIANTINE.get(fila1.charAt(indiceInizio)));
			piante.add(MAPPA_PIANTINE.get(fila1.charAt(indiceFine)));
			piante.add(MAPPA_PIANTINE.get(fila2.charAt(indiceInizio)));
			piante.add(MAPPA_PIANTINE.get(fila2.charAt(indiceFine)));
			this.mappaBambiniPiante.put(bambino, piante);
		}
	}

	public void stampaAssociazionePianteBambino() {
		System.out.println(mappaBambiniPiante);
	}

	public static void main(String[] args) {
		String fila1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
		String fila2 = "VRCCCGCRRGVCGCRVVCVGCGCV";
		GiardinoAsilo giardino = new GiardinoAsilo(fila1, fila2);
		giardino.stampaAssociazionePianteBambino();
	}
}