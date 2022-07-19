package edunova;

//za upisani cjeli broj
	// ispiši zbroj zvih znamenki
	
	// ulaz: 263736
	// izlaz: 27
	
	// ulaz: 26
	// izlaz: 8
	

import javax.swing.JOptionPane;

public class Zadatak21 {
public static void main(String[] args) {

	
	int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost"));
	int suma=0;
	
	 while(broj>0) {
		 
		 suma=suma + broj%10;
		 broj= broj / 10;
		 
		 
	 }
	
       System.out.println(suma);	
 	
	
	
	
	
}



}
