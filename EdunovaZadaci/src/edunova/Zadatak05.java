package edunova;

import javax.swing.JOptionPane;

//Za upisani cjeli broj
// program ispisuje da li je 
// parni broj ili ne

public class Zadatak05 {
	public static void main(String[] args) {

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		if (broj % 2 == 0) {
			System.out.println("Broj je paran");
		} else {
			System.out.println("Broj je neparan");
		}

	}

}
