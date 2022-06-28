package zadatci;

import javax.swing.JOptionPane;

//Write a Java program that takes a number as input and prints its multiplication table up to 10. Go to the editor
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80



public class Z07 {
public static void main(String[] args) {
	
	int n= Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
	
	for(int i=1;i<=10;i++) {
		System.out.println(n + " * " + (i) +  "  = "+ (n*i));
	}
	
}
}
