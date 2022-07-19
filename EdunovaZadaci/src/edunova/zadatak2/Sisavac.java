package edunova.zadatak2;

public class Sisavac extends Toplokrvni {
	
	private  int danaTrudnoce;

	
	
	
	
	
	
	
	
	public Sisavac() {
		super();
	}

	public Sisavac(String naziv, double temperatura, int danaTrudnoce) {
		super(naziv, temperatura);
		this.danaTrudnoce = danaTrudnoce;
	}

	public int getDanaTrudnoce() {
		return danaTrudnoce;
	}

	public void setDanaTrudnoce(int danaTrudnoce) {
		this.danaTrudnoce = danaTrudnoce;
	}
	
	
	
	

}
