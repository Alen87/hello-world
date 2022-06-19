package vjezba;

import javax.swing.JOptionPane;

////Učitati članove , naći najveći i  najmanji član niza

public class Zadatak15 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj  clanova niza"));

		int[] niz = new int[n];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

		int tmin = niz[0];
		int tmax = niz[0];

		for (int i = 1; i < niz.length; i++) {
			if (tmin > niz[i]) {
				tmin = niz[i];
			} else if (tmax < niz[i]) {
				tmax = niz[i];

			}

		}

		System.out.println("\nNajmanji clan niza je  " + tmin + "\nNajveci clan niza je   " + tmax);

	}
}
