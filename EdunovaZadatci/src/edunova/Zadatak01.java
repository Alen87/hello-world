package edunova;

import javax.swing.JOptionPane;

//Napisati program koji unosi
		// tri decimalna broja
		// i ispisuje umnožak prvog i treæeg
		// umanjeno za drugi broj

public class Zadatak01 {
	public static void main(String[] args) {
		
		
		double a=Double.parseDouble(JOptionPane.showInputDialog("Unesi vrijednost a"));
		double b=Double.parseDouble(JOptionPane.showInputDialog("Unesi vrijednost b"));
		double c=Double.parseDouble(JOptionPane.showInputDialog("Unesi vrijednost c"));
		
		
		
		double umnozak=a * c;
		double razlika=umnozak -b;
		System.out.println(razlika);
		
		
		
		
		
		
		
		
		
	}

}
