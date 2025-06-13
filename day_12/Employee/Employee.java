package day_12.Employee;
public class Employee {
	
	private String codiceFiscale;
	private String nome;
	private double stipendio;
	
	
	//cotruttore default
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//cotruttore parametrico
	public Employee(String codiceFiscale, String nome, double stipendio) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	
	// definizione metodi getter setter
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	//metodo ToString
	@Override
	public String toString() {
		return "Employee [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", stipendio=" + stipendio + "]";
	}
}






