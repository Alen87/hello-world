package alen;

import javax.swing.JOptionPane;

public class CiklicnaTablicaGD {
	public static void main(String[] args) {
		
	 

		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
	    int kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj kolona"));

		int[][] matrica = new int[red][kolona];
		int pocetak = 1;

		int minRed = 0;
		int maxRed = red - 1;
		int minKolona = 0;
		int maxKolona = kolona - 1;

		while (pocetak <= red * kolona) {

			for (int i = minRed; i <= maxRed; i++) {
				matrica[i][maxKolona] = pocetak++;
			}
			
			for(int j=maxKolona-1;j>=minKolona;j--) {
				matrica[maxRed][j]=pocetak++;
			}
			
			for(int i=maxRed-1;i>=minRed;i--) {
				matrica[i][minKolona]=pocetak++;
			}
			
			for(int j=minKolona+1;j<=maxKolona-1;j++) {
				matrica[minRed][j]=pocetak++;
			}
			
			
			minRed++;
			maxRed--;
			minKolona++;
			maxKolona--;
			

		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();
		}

	}

}
