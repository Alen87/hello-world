package edunova;

import javax.swing.JOptionPane;

//program osigurava unos niza
	// znakova (String) koji ima
	// minimalno 3 znaka
	// ako nema tri znaka ispisuje korisniku
	// poruku: Minimalno 3 znaka


public class Zadatak18 {
	public static void main(String[] args) {
		
		String rijec;
		
		while(true) {
			
			rijec=JOptionPane.showInputDialog("Unesi vrijednost");
			
			if(rijec.length()<3) {
				System.out.println("Minimalno 3 znaka");
				continue;
			}
			
			break;
		}
		
	    System.out.println(rijec);
	}

}
