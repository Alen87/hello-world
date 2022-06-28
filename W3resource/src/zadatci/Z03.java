package zadatci;

import javax.swing.JOptionPane;

//3. Write a Java program to divide two numbers and print on the screen. Go to the editor
//Test Data :
//50/3
//Expected Output :
//16


public class Z03 {
public static void main(String[] args) {
	
	int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
    int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
    
    
     int division=i/n;
	
	System.out.println(division);
	
	
	
	
	
}
}
