package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Korisnik unosi dimenzije 
// matrice (x i y)
// program puni matricu sluèajnim 
// vrijednostima izmeðu 5 i 9
// program ispisuje izgraðenu matricu

public class Zadatak15 {
	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost y"));

		int[][] niz = new int[x][y];

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][j] = (int) ((Math.random() * (9 - 5)) + 5);
			}
			
			
		}
		for(int i=0;i<niz.length;i++) {
			System.out.println(Arrays.toString(niz[i]));
			
		}

	}

}
