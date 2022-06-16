package vjezba;

import javax.swing.JOptionPane;

public class Zadatak05 {
	public static void main(String[] args) {

		// Učitati stranice trokuta i izračunati opseg (Koristiti IF naredbu).

		double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi b"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Unesi c"));

		double o;

		if (a > 0 && b > 0 && c > 0) {

			o = a + b + c;
			System.out.println(o);

		} else {
			System.out.println("Takav  trokut ne  postoji");
		}

	}

}
