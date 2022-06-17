package vjezba;

import javax.swing.JOptionPane;

//Učitati članove niza. Izračunati i ispisati sumu članova niza.

public class Zadatak09 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj  clanva niza"));

		int[] niz = new int[n];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		}
		
		int sum=0;
		for(int i=0;i<niz.length;i++) {
			sum+=niz[i];}
			System.out.println("Zbroj clanova  niza  je  " + sum);
		
		}

	}


