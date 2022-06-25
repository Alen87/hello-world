package vjezba;

import javax.swing.JOptionPane;

//Učitati dvodimenzionalni niz. Ispisati parne članove matrice.


public class Zadatak22 {
	public static void main(String[] args) {
		
		int k=Integer.parseInt(JOptionPane.showInputDialog("Unesi k"));
		int l=Integer.parseInt(JOptionPane.showInputDialog("Unesi l"));
		
		int[][]niz=new int[k][l];
		
		for(int i=0;i<niz.length;i++) {
			for(int j=0;j<niz[i].length;j++) {
				niz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			}
		}
	
		System.out.print("Ispisi clanove:");
		for(int i=0;i<niz.length;i++) {
			System.out.println();
			for(int j=0;j<niz[i].length;j++) {
				System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Ispisi parne  clanove:");
		for(int i=0;i<niz.length;i++) {
			for(int j=0;j<niz[i].length;j++) {
				if(niz[i][j]%2==0) {
					System.out.print(niz[i][j] + " ");
				}
				
			}
		}
		
		
		
		
	}

}
