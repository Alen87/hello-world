package vjezba;

import javax.swing.JOptionPane;

// Učitati članove , naći najveći ,  najmanji član niza,te  njihov zbroj,razliku,umnozak,kolicnik

public class Zadatak16 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj  clanova  niza"));

		int[] niz = new int[n];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

		int tmin = niz[0];
		int tmax = niz[0];
		int zbroj;
		int razlika;
		double kolicnik;
		int umnozak;

		for (int i = 1; i < niz.length; i++) {
			if (tmin > niz[i]) {
				tmin = niz[i];
			} else if (tmax < niz[i]) {
				tmax = niz[i];
			}
		}

		System.out.println("\nNajmanji clan  niza  je  " + tmin);
		System.out.println("Najveci clan  niza  je   " + tmax);

		zbroj = tmin + tmax;

		System.out.println("Zbroj najmanjeg  i  najveceg  clana niza je  " + zbroj);

		razlika = tmax - tmin;

		System.out.println("Razlika najveceg  i  najmanjeg clana  niza je  " + razlika);

		umnozak = tmax * tmin;

		System.out.println("Umnozak najveceg i  najmanjeg  clana  niza je  " + umnozak);

		kolicnik = (double) tmax / tmin;

		System.out.println("kolicnik najveceg  i  najmanjeg  broja  je  " + kolicnik);

	}
}
