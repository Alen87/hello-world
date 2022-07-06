package alen;

import javax.swing.JOptionPane;

public class CiklicnaDoljeLijevo {
public static void main(String[] args) {
	
	
	
		ispisMatrice(smjerKretanja(kreiranjeMatrice()));	
			
			
	}


static void ispisMatrice(int[][]matrica) {
	for(int i=0;i<matrica.length;i++) {
		for(int j=0;j<matrica[0].length;j++) {
			System.out.printf("%4d",matrica[i][j]);
		}
		System.out.println();
	}
	
}



static int[][] kreiranjeMatrice() {
	int red=0;
	int kolona=0;
while(true) {	
	

	try {
		 red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
	     kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj kolona"));
		break;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Neispravan unos");
	}
	
}  
	
	int[][]matrica=new int[red][kolona];
	
	
	
	
	
	return matrica;
}



static int [][] smjerKretanja(int[][]matrica) {
   
	int red=matrica.length;
	int kolona=matrica[0].length;
	
	int pocetak=1;
	
	int minRed=0;
	int maxRed=red-1;
	int minKolona=0;
	int maxKolona=kolona-1;
	
	
	while (pocetak<=red*kolona){
		
		for(int i=maxRed;i>=minRed;i--) {
			matrica[i][minKolona]=pocetak++;
		}
		
		for(int j=minKolona+1;j<=maxKolona;j++) {
			matrica[minRed][j]=pocetak++;
		}
		
		for(int i=minRed+1;i<=maxRed;i++) {
			matrica[i][maxKolona]=pocetak++;
		}
		
		for(int j=maxKolona-1;j>=minKolona+1;j--) {
			matrica[maxRed][j]=pocetak++;
		}
			
		
		minRed++;
		maxRed--;
		minKolona++;
		maxKolona--;
			
		
		
	}
		
	
	
	return matrica;
	
}



      
}
