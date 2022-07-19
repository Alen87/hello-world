package edunova.zadatak01;

import java.util.Date;

//Kreirajte klasu Grupa s svojstvima
	// naziv, datum poèetka, smjer i predavaè
	// Smjer ima naziv i cijenu
	// Predavaè ima ime i prezime
	// SVE KLASE MORAJU BITI U PAKETU
	// edunova.zadatak1
	

public class Grupa {
	
	private String naziv;
	private Date datumPocetka;
	private  Smjer smjer;
	private Predavac predavac;
	
	
	
	
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	public Predavac getPredavac() {
		return predavac;
	}
	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}
	
	
	
	
	

}
