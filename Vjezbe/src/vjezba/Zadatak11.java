package vjezba;

//Unos tri  clana,pronaci  najveci

import javax.swing.JOptionPane;

public class Zadatak11 {
	public static void main(String[] args) {

		int[] niz = new int[3];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		}

		if (niz[0] > niz[1] && niz[0] > niz[2]) {
			System.out.println(niz[0]);
		} else if (niz[1] > niz[2]) {
			System.out.println(niz[1]);
		} else {
			System.out.println(niz[2]);
		}

	}
}
