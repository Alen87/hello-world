package edunova;

import javax.swing.JOptionPane;

//Program uèitava dva broja
	// ispisuje zbroj dvaju uèitanih brojeva
	// Kreirati metode:
	// ucitaj
	// izracunaj
	// ispisi


public class Zadatak20 {
	public static void main(String[] args) {
		
		
		ispisi(izracunaj(ucitaj("a"),ucitaj("b")));
		
		
		
	}
	
	static int ucitaj(String poruka) {
		
		
		return Integer.parseInt(JOptionPane.showInputDialog(poruka));
	}
	
   static  int izracunaj(int a,int b) {
	   
	   return a +b;
   }
   
   
   static void ispisi(int b) {
	   
	   System.out.println(b);
   }
   
   

}
