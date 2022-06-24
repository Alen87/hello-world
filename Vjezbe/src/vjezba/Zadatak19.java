package vjezba;

import javax.swing.JOptionPane;

//Učitati dvodimenzionalni niz. Ispisati članove matrice koji su djeljive sa 3.

public class Zadatak19 {
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi a:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi b:"));

		int[][] niz = new int[a][b];
        System.out.print("Clanovi:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			}
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.println();
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
		}
        System.out.println();
        System.out.println("Clanovi  djeljivi sa 3");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz[i][j] % 3 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}

	}
}
