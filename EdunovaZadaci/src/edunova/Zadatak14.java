package edunova;

import javax.swing.JOptionPane;

//Program od korisnika unosi
	// cjele brojeve dok korisnik
	// ne unese broj -1
	// program ispisuje sumu svih unesenih
	// brojeva
	// koristeæi while

public class Zadatak14 {
	public static void main(String[] args) {
		
		
		
		
		int a=0,suma=0;
		
		
		while(a!=-1) {
			
			a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			suma+=a;
			
			
			
			
			
		}
		
		
		System.out.println(suma + 1);
		
		
		
	}

}
