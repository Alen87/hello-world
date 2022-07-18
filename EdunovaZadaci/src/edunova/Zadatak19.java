package edunova;

import javax.swing.JOptionPane;

//Metoda prima niz cjelih brojeva
	// metoda vraæa najmanji elelent niza
	// metoda se zove najmanji


public class Zadatak19 {
	public static void main(String[] args) {
		 
		int[]najmanjiNiz=new int[5];
		
		for(int i=0;i<najmanjiNiz.length;i++) {
			najmanjiNiz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost"));
		}
	
		System.out.println(najmanji(najmanjiNiz));
		
	
	
	}
	
	static int najmanji(int[]niz) {
		
	  int min=Integer.MAX_VALUE;
		for(int a:niz) {
			if(a<min) {
				min=a;
			}
		}
		
		
		return min;
	}
	
	
}
