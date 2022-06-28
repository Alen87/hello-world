package zadatci;

import javax.swing.JOptionPane;

//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5


public class Z06 {
public static void main(String[] args) {
	
	int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));	
	
	int sum=i+n;
	int multiply= i* n;
	int divide= i/n;
	int difference=i-n;
	int remainders=i%n;
	
	
	System.out.println(sum);
	System.out.println(multiply);
	System.out.println(divide);
	System.out.println(difference);
	System.out.println(remainders);
	
}
}
