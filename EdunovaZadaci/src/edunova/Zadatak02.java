package edunova;

import javax.swing.JOptionPane;

//Napisi  program  koji  kada  unesemo  dvoznamenkasti  broj,
// ispise zadnju  znamenku

public class Zadatak02 {
	public static void main(String[] args) {

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unasi  broj"));

		System.out.println(broj % 10);

	}

}
