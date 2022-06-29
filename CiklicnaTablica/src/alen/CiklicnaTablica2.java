package alen;

import javax.swing.JOptionPane;

//Zadatak ciklicna tablica , kretanje od lijevog donjeg kuta,prema  unutrasnjosti

public class CiklicnaTablica2 {
	public static void main(String[] args) {

		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost reda"));
		int kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost kolone"));
		int umnozak = red * kolona;
		int[][] matrica = new int[red][kolona];

		int zaPopuniti = umnozak;
		int trenutniBroj = 1;
		int trenutniRed = red - 1;
		int trenutnaKolona = 0;
		int trenutnaGranicaLijevo = 1;
		int trenutnaGranicaGore = 0;
		int trenutnaGranicaDesno = kolona - 1;
		int trenutnaGranicaDolje = red - 1;
		char trenutniSmjer = 'U';

		while (zaPopuniti > 0) {

			matrica[trenutniRed][trenutnaKolona] = trenutniBroj;
			zaPopuniti--;
			trenutniBroj++;

			if (trenutniSmjer == 'U') {
				if (trenutniRed ==trenutnaGranicaGore) {
					trenutniSmjer = 'R';
					trenutnaKolona++;
				} else {
					trenutniRed--;
				}

			}else if(trenutniSmjer=='R') {
				if(trenutnaKolona==trenutnaGranicaDesno) {
					trenutniSmjer='D';
				    trenutniRed++;
				}else {
					trenutnaKolona++;
				}
			}else if(trenutniSmjer=='D') {
				if(trenutniRed==trenutnaGranicaDolje) {
					trenutniSmjer='L';
					trenutnaKolona--;
				}else {
					trenutniRed++;
				}
			}else if(trenutniSmjer=='L'){
				if(trenutnaKolona== trenutnaGranicaLijevo) {
					trenutniSmjer='U';
					trenutniRed--;
					
					trenutnaGranicaGore++;
					trenutnaGranicaDesno--;
					trenutnaGranicaDolje--;
					trenutnaGranicaLijevo++;
					
					
					
					
				}else {
					trenutnaKolona--;
				}
				
				
			}
		}

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {

				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();

		}

	}
}