package edunova.zadatak05;

public class Riba extends Zivotinja {
	
	private String skrge;
	private double duzina;
	
	
	
	public Riba() {
		super();
	}
	public Riba(String ime, int godina, String skrge, double duzina) {
		super(ime, godina);
		this.skrge = skrge;
		this.duzina = duzina;
	}
	public String getSkrge() {
		return skrge;
	}
	public void setSkrge(String skrge) {
		this.skrge = skrge;
	}
	public double getDuzina() {
		return duzina;
	}
	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}
	
	
	
	
	

}
