package zadatci;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

////Write a Java method to find the smallest number among three numbers. Go to the editor
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//
////The smallest value is 25.0

public class Zadatak09 {
	public static void main(String[] args) {

		while (true) {
			try {
				int first = Integer.parseInt(JOptionPane.showInputDialog("Unesi  prvi  broj"));
				int second = Integer.parseInt(JOptionPane.showInputDialog("Unesi  drugi  broj"));
				int third = Integer.parseInt(JOptionPane.showInputDialog("Unesi  treci  broj"));
				ispis(smallest(first, second, third));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Niste unijeli broj");
				continue;
			}

		}

	}

	static int smallest(int first, int second, int third) {

		int min = 0;

		if (first < second && first < third) {
			min = first;
		} else if (second < third) {
			min = second;
		} else {
			min = third;
		}

		return min;
	}

	static void ispis(int a) {
		System.out.println(" Smallest number is " + a);

	}

}
