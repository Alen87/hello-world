package edunova.zadatak03;

public abstract class Uredaj {

	
	private String podatci;
	
	
	
	
	
	public Uredaj() {
		super();
	}

	public Uredaj(String podatci) {
		super();
		this.podatci = podatci;
	}

	public String getPodatci() {
		return podatci;
	}

	public void setPodatci(String podatci) {
		this.podatci = podatci;
	}

	@Override
	public String toString() {
		return podatci;
	}

	
	
	
	
	
	
	
	
	
}
