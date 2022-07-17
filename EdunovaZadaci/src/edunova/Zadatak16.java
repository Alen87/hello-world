package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

//za upisani cjeli broj
	// ispiši zbroj zvih znamenki
	
	// ulaz: 263736
	// izlaz: 27
	
	// ulaz: 26
	// izlaz: 8
	

public class Zadatak16 {
	public static void main(String[] args) {
		
		
		int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost broja"));
		int suma=0;
		
		while(broj>0) {
			suma+=broj%10;
			 broj/=10;
			
			
		}
		
		
		 System.out.println(suma);
		
		
		
		
		
		
		
		
	}

}
