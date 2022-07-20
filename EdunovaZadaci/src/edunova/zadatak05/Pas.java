package edunova.zadatak05;

public class Pas extends Zivotinja {
	
	private String vrsta;
	private String lavez;
	
	
	
	public Pas() {
		super();
	}
	public Pas(String ime, int godina, String vrsta, String lavez) {
		super(ime, godina);
		this.vrsta = vrsta;
		this.lavez = lavez;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getLavez() {
		return lavez;
	}
	public void setLavez(String lavez) {
		this.lavez = lavez;
	}
	@Override
	public String toString() {
		return super.toString() +" "+ vrsta + " " + lavez;
	}
	
	
	
	
	
	

}
