package vjezba;

import javax.swing.JOptionPane;

public class Zadatak01 {
	public static void main(String[] args) {

		// Ucitati a,b, ako je a vece od b onda je c=2a-b, inace je c=a+2b.

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi b"));
		int c;

		if (a > b) {
			c = 2 * a - b;
		} else {
			c = a + 2 * b;
		}
		
		
		System.out.println(c);

	}

}
