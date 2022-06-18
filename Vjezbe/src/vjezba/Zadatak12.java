package vjezba;

import javax.swing.JOptionPane;

//Učitati članove niza. Izračunati i ispisati sumu članova niza koji nisu djeljivi sa 2 (neparan).

public class Zadatak12 {
public static void main(String[] args) {
	
	int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj  clanova niza"));
	int[]niz=new int[n];
	
	for(int i=0;i<niz.length;i++) {
		niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
	}
	int sum=0;
	for(int i=0;i<niz.length;i++) {
		if(niz[i] %2 !=0) {
			sum +=niz[i];
		}
	}
	
	System.out.println(sum);
	
}
}
