package edunova;

import javax.swing.JOptionPane;

//Za unesena dva cjela broj
// program ispisuje najveæi

public class Zadatak06 {
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost b"));

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

}
