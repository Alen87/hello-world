package vjezba;

import javax.swing.JOptionPane;

//Izračunati sumu prirodnih brojeva u intervalu od k do n koji su djeljivi sa 3.



public class Zadatak27 {
	public static void main(String[] args) {
		int k=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost k"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost n"));
		
		ispis(suma(k,n));
		
	}
	
	
	static int suma(int k,int n) {
		int suma=0;
		for(int i=k;i<=n;i++) {
			if(i%3==0) {
				suma+=i;
			}
		}
		
		
		
		
		return suma;
	}
	
	
	
	static void ispis(int suma) {
		
		System.out.println("Suma  prirodnih brojeva i intervalu od k do n  koji  su  djeljivi  sa 3 iznosi   " + suma);
	}

}
