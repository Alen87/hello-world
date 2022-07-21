package edunova.ponavljanjePolimorfizam;
import java.io.Serializable;
import java.math.BigDecimal;

public class Predavac extends Osoba implements Serializable {
	
	private static final long serialVersionUID=1L;
	private BigDecimal kotizacija;
	private BigDecimal rucak;
	
	
	
	
	
	
	public Predavac() {
		super();
	}
	public Predavac(int sifra, String ime, String prezime, BigDecimal kortizacija, BigDecimal rucak) {
		super(sifra, ime, prezime);
		this.kotizacija = kortizacija;
		this.rucak = rucak;
	}
	public BigDecimal getKortizacija() {
		return kotizacija;
	}
	public void setKortizacija(BigDecimal kortizacija) {
		this.kotizacija = kortizacija;
	}
	public BigDecimal getRucak() {
		return rucak;
	}
	public void setRucak(BigDecimal rucak) {
		this.rucak = rucak;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public BigDecimal getUkupno() {
		if(kotizacija==null && rucak==null) {
			return BigDecimal.ZERO;
			
		}
		
		if(kotizacija==null) {
			return rucak;
		}
		if(rucak==null) {
			return kotizacija;
		}
		
		return kotizacija.add(rucak);
	}
	
	
	
	
	

}
