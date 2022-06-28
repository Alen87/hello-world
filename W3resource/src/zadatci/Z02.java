package zadatci;

import javax.swing.JOptionPane;

//2. Write a Java program to print the sum of two numbers. Go to the editor
//Test Data:
//74 + 36
//Expected Output :
//110



public class Z02 {
	public static void main(String[] args) {

		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	    int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	    
	    
	     int sum=i +n;
		
		System.out.println(sum);
		
	}
}
