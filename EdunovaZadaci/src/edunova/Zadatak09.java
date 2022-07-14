package edunova;

import javax.swing.JOptionPane;

//Program unosi 2 broja
	// Ako su oba broja parni
	// ispisuje njihov zbroj
	// inaèe ispisuje njihovu razliku


public class Zadatak09 {
public static void main(String[] args) {
	
	
	int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost  a"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost  b"));
	
	int suma=0;
	int razlika=0;
	
	
	if ((a%2==0)  && (b%2==0)) {
		suma=a+b;
		System.out.println(suma);
		
	}else {
		razlika = a-b;
		System.out.println(razlika);
	}
	
	
	System.out.println((a%2==0 && b%2==0) ? suma:razlika);
	
}
	
	
	
}
