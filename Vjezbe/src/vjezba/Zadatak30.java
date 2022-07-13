package vjezba;

import javax.swing.JOptionPane;

//1. Write a Java method to find the smallest number among three numbers. Go to the editor
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//
//The smallest value is 25.0

public class Zadatak30 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost a"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost b"));
		int c =Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost c"));
		
		
		
		System.out.println(smallest(a,b,c));
		
		

	}

	public static int smallest(int a, int b, int c) {

		int smallest=0;

		if (a < b && a < c) {
			smallest=a;
		} else if (b < c) {
			smallest=b;
		} else {
			smallest=c;
		}

		return smallest;
	}

}
