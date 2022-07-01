package alen;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Zadatak ciklicna tablica , kretanje od lijevog gornjeg kuta,prema  unutrasnjosti

public class CiklicnaTablica3 {
	public static void main(String[] args) {
		while (true) {
			try {
				int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj  redova"));
				int kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj kolona"));
				ispis(lijevoGore(red, kolona));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Niste unijeli cijeli broj");
				continue;
			}

		}
	}

	static int[][] lijevoGore(int red, int kolona) {

		int umnozak = red * kolona;

		int[][] matrica = new int[red][kolona];

		int zaPopunit = umnozak;
		int trenutniRed = 0;

		int trenutnaKolona = 0;
		int trenutniBroj = 1;
		char trenutniSmjer = 'R';
		int trenutnaGranicaDolje = kolona - 1;
		int trenutnaGranicaLijevo = red - 1;
		int trenutnaGranicaGore = 0;
		int trenutnaGranicaDesno = 1;
		while (zaPopunit > 0) {
			matrica[trenutniRed][trenutnaKolona] = trenutniBroj;
			trenutniBroj++;
			zaPopunit--;

			if (trenutniSmjer == 'R') {
				if (trenutnaKolona == trenutnaGranicaDolje) {
					trenutniSmjer = 'D';
					trenutniRed++;
				} else {
					trenutnaKolona++;
				}

			} else if (trenutniSmjer == 'D') {
				if (trenutniRed == trenutnaGranicaLijevo) {
					trenutniSmjer = 'L';
					trenutnaKolona--;
				} else {
					trenutniRed++;

				}
			} else if (trenutniSmjer == 'L') {
				if (trenutnaKolona == trenutnaGranicaGore) {
					trenutniSmjer = 'U';
					trenutniRed--;
				} else {
					trenutnaKolona--;
				}
			} else if (trenutniSmjer == 'U') {
				if (trenutniRed == trenutnaGranicaDesno) {
					trenutniSmjer = 'R';
					trenutnaKolona++;

					trenutnaGranicaDolje--;
					trenutnaGranicaGore++;
					trenutnaGranicaLijevo--;
					trenutnaGranicaDesno++;

				} else {
					trenutniRed--;
				}

			}
		}
		return matrica;

	}

	static void ispis(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {

				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();
		}

	}

}
