package vjezba;

import javax.swing.JOptionPane;

//1. Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor
//
//Test Data
//Input number: 35
//Expected Output :
//Number is positive


public class Zadatak29 {
	public static void main(String[] args) {
		
		int number=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		
		if(number > 0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is  negative");
		}
		
		
		
		
		
	}


}