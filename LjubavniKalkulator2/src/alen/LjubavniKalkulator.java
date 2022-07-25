package alen;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {
	public static void main(String[] args) {
		String ime1 = "Marta", ime2 = "Manuel";

		String zbroj = ime1 + ime2;

		int[] niz = new int[zbroj.length()];

		int count = 0;

		for (int i = 0; i < zbroj.length(); i++) {
			count = 0;
			for (int j = 0; j < zbroj.length(); j++) {
				if (zbroj.toLowerCase().trim().charAt(i) == zbroj.toLowerCase().trim().charAt(j)) {
					count++;
				}
			}
			niz[i] = count;
		}

		//System.out.println(Arrays.toString(niz));

		// imam cijeli niz
		// sad ga treba razdijeliti

		int[] niz1 = new int[ime1.length()];
		int[] niz2 = new int[ime2.length()];

		for (int i = 0; i < niz.length; i++) {

			if (i < ime1.length()) {
				niz1[i] = niz[i];
			} else if (i >= ime1.length()) {
				niz2[i - ime1.length()] = niz[i];
			}
		}

		System.out.println();
		System.out.println("    " + ime1 + "               " + ime2);
		System.out.print(Arrays.toString(niz1) + "    " + Arrays.toString(niz2));
		System.out.println();

		for (count = zbroj.length() / 2; count > 2; count--) {

			if (zbroj.length() % 2 == 0) {
				for (int i = 0; i < zbroj.length() / 2; i++) {
					int broj1 = niz[i];
					int broj2 = niz[zbroj.length() - 1 - i];
					int rezultat = broj1 + broj2;
					System.out.print(rezultat + " ");
					System.out.println();

				}
			} else {
				for (int i = 0; i < zbroj.length() / 2; i++) {
					int broj1 = niz[i];
					int broj2 = niz[zbroj.length() - 1 - i];
					int rezultat = broj1 + broj2;
					System.out.print(rezultat + " ");

				}
				int sredina = niz[zbroj.length() / 2];
				System.out.print(sredina);
				System.out.println();

			}

		}

	}
}
