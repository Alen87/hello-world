package edunova.zadatak05;

public abstract class Zivotinja {
	
	private String ime;
	private int godina;
	
	

	public Zivotinja() {
		super();
	}
	public Zivotinja(String ime, int godina) {
		super();
		this.ime = ime;
		this.godina = godina;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	
	
	
	@Override
	public String toString() {
		return ime + " " + godina;
	}
	

   	
	
	
	
	
}
