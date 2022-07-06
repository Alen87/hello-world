package alen;

import javax.swing.JOptionPane;

public class CiklicnaTablicaDL {
	public static void main(String[] args) {
		
		
         int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
         int kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj kolona"));
			
				

			

	    int matrica[][] = new int[red][kolona];

		int pocetak = 1;
		int minRed = 0;
		int maxRed = red - 1;
		int minKolona = 0;
		int maxKolona = kolona - 1;

		while (pocetak <= red * kolona) {

			for (int i = maxKolona; i >= minKolona; i--) {
				matrica[maxRed][i] = pocetak++;
			}

			for (int j = maxRed - 1; j >= minRed; j--) {
				matrica[j][minKolona] = pocetak++;
			}
			for (int i = minKolona + 1; i <= maxKolona; i++) {
				matrica[minRed][i] = pocetak++;
			}

			for (int j = minRed + 1; j <= maxRed - 1; j++) {
				matrica[j][maxKolona] = pocetak++;
			}

			maxKolona--;
			minKolona++;
			maxRed--;
			minRed++;
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();

		}

	}

}

