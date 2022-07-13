package edunova;

import javax.swing.JOptionPane;

//Za dva unesena cijela broja
// program ispisuje Osijek
// ako je zbroj veæi od 10 
// inaèe ispisuje Edunova

public class Zadatak04 {
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost b"));
		int suma = a + b;

		if(suma > 10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}

		

	}
}
