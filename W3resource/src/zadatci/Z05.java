package zadatci;
//

//5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125

import javax.swing.JOptionPane;

public class Z05 {
	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		int product = i * n;
		
		System.out.println(product);

	}
}
