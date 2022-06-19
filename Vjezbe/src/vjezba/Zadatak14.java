package vjezba;

import javax.swing.JOptionPane;

//Učitati članove i naći najveći član niza.

public class Zadatak14 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj  clanova  niza"));

		int[] niz = new int[n];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i] );
		}

		int tmax = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (tmax < niz[i]) {
				tmax = niz[i];
			}

		}

		System.out.println( "\n" + tmax);

	}
}
