package day_16.CalcoloFattura;

import java.math.BigDecimal;

/*Una compagnia che vende servizi telefonici ed energetici deve calcolare lefatture dei suoi clienti.

Si scriverà una classe Clienti che dichiarerà i seguentiattributi: nome ,cognome , prezzoDaPagare.
Clienti ha quattro figli: ClientiLuce,ClientiGas, ClientiFisso, ClientiMobile. ClientiLuce dichiara i seguenti
attributiprivati: costoKwh e Kwh per indicare i chilowatt ora consumati.
Se il cliente haconsumato meno di 300Kwh il costo del Kwh è di 0.25per ogni Kwhconsumato.
Se il cliente ha consumato più di 300Kwh ma meno di 700 paga0.18 altrimenti paga 0.15.
Il costo totale lo fa il prodotto tra il consumo e il prezzo. ClientiGas dichiara iseguenti attributi privati:
costoMetroCubo e metroCubi per indicare i metricubi consumati.
Lo stesso della classe precedente ma con diversi parametri:se il consumo è sotto i 50 metri cubi il cliente paga 1
per ogni metrocuboconsumato, se compreso tra 50 e 80 paga 0.8 al metro cubo, sopra gli 80 paga0.7 al metro cubo.
ClientiFisso dichiara il seguente attirbuto tipo Cliente chepuò essere “STANDARD” “SPECIAL” ”SUPERSPECIAL”,
questi valori settanodirettamente la variabile prezzoDaPagare(del padre),rispettivamentea 30, 50,60.
ClientiMobile dichiara il seguente attributo int gigaByte.
Se il cliente ha menodi 30 giga paga 8, se ne ha compresi tra 30 e 80 paga 12, se ha più di 80 gigapaga 15.
Preferibile una inizializzazione con costruttoreparametrico.
Ovviamente si escludano dalla inizializzazione tutti gli attributicalcolati come costo Kwh e costo MetroCubo.
Creare un metodocalcolaBollette con parametro polimorfo che prenda in input un Cliente edeffettui i controlli
con instanceof. Creare una classe di test creare un array di10 clienti scegliendo tra le quattro tipologie
e chiamare il metodo calcolaBollette dentro un foreach. */
public abstract class Cliente {

	private String cf;
	private String nome;
	private String cognome;
	private BigDecimal prezzoDaPagare;

	public Cliente() {
		super();
	}

	public Cliente(String cf, String nome, String cognome) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public BigDecimal getPrezzoDaPagare() {
		return prezzoDaPagare;
	}

	public void setPrezzoDaPagare(BigDecimal prezzoDaPagare) {
		this.prezzoDaPagare = prezzoDaPagare;
	}

	@Override
	public String toString() {
		return "cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + ", prezzoDaPagare=" + prezzoDaPagare;
	}

}