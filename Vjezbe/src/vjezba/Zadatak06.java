package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

// Učitati i ispisati članove niza.


public class Zadatak06 {
	public static void main(String[] args) {
		
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj  clanova  niza"));
		int[]niz=new int[n];
		
		for(int i=0;i<niz.length;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		}
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
			
		
		
	}

}
