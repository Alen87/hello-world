package vjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Clanove niza sa neparnim ideksom

public class Zadatak08 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj  clanova  niza"));
		int[] niz = new int[n];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
		}

		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0) {
				System.out.println("niz[" + i + "]=" + niz[i]);
			}
		}

	}
}
