package edunova;

import javax.swing.JOptionPane;

//Deklarirajte niz od 4 cijela broja,
	// u niz uèitajte vrijednosti od korisnika
	// ispišite sumu svih upisanih vrijednosti


public class Zadatak11 {
	public static void main(String[] args ) {
		
		
		int[]niz=new int[4];
		
		
		for(int i=0;i<niz.length;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		}
		
		int suma=0;
		
		for(int broj:niz) {
			suma+=broj;
		}
		
		System.out.println(suma);
		
		
		
	}

}
