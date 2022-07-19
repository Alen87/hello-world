package edunova.zadatak03;

public class Racunalo extends Uredaj {

	private String vrstaPrikljucka;
	
	
	
	

	public Racunalo() {
		super();
	}



	public Racunalo(String podatci, String vrstaPrikljucka) {
		super(podatci);
		this.vrstaPrikljucka = vrstaPrikljucka;
	}

	

	public String getVrstaPrikljucka() {
		return vrstaPrikljucka;
	}

	public void setVrstaPrikljucka(String vrstaPrikljucka) {
		this.vrstaPrikljucka = vrstaPrikljucka;
	}



	@Override
	public String toString() {
		
		return super.toString() + " " + vrstaPrikljucka;

	}

	


	
	
	
	
	
	
	
}
