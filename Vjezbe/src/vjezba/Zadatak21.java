package vjezba;

import javax.swing.JOptionPane;

//Učitati i ispisati dvodimenzionalni niz - matricu nxn. Zatim ispisati članove niza koji su na glavnoj dijagonali.

public class Zadatak21 {
	public static void main(String[] args) {
        System.out.println("Kvadratna  matrica");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		int[][] niz = new int[n][n];
        System.out.println("Unesi clanove");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			}
		}

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
                  System.out.println(niz[i][j] +  " ");
			}
		}
		System.out.println();
		System.out.println("Clanovi na glavnoj  diagonali su:");
		for(int i=0;i<niz.length;i++) {
			for(int j=0;j<niz[i].length;j++){
             if(i==j) {
            	 System.out.println(niz[i][j] + " ");
             }
      				
			}
		}
	}
}
