package vjezba;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {
		// Učitati dva broja veći se množi za 2 a manji dijeli sa 3.

		double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi b"));

		if (a > b) {
			System.out.println("veci*2 = " + (a * 2) + " manji/3 = " + (b /3));
		}else {
			System.out.println("veci*2 = " + (b * 2) + " manji/3 = " + (a /3));
			
		}

	}

}
