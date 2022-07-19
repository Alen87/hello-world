package edunova.zadatak03;

public class Televizor extends Uredaj {
	
	
	private String vrstaDaljinskog;
	
	
	
	public Televizor() {
		super();
	}

	public Televizor(String podatci, String vrstaDaljinskog) {
		super(podatci);
		this.vrstaDaljinskog = vrstaDaljinskog;
	}

	public String getVrstaDaljinskog() {
		return vrstaDaljinskog;
	}

	public void setVrstaDaljinskog(String vrstaDaljinskog) {
		this.vrstaDaljinskog = vrstaDaljinskog;
	}

	@Override
	public String toString() {
		return  super.toString() + " " + vrstaDaljinskog;
	}

	
	
	
	
	

}
