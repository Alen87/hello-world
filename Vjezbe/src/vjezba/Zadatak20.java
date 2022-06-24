package vjezba;

import javax.swing.JOptionPane;

//Učitiat i ispisati dvodimenzionalni niz - matricu 2x3.

public class Zadatak20 {
	public static void main(String[] args) {

		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi a:"));
		int kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi b:"));

		int[][] niz = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				niz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			}
		}

		for (int i = 0; i <red; i++) {
			for (int j = 0; j < kolona; j++) {
               System.out.print(niz[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
