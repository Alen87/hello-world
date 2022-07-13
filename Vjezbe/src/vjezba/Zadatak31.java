package vjezba;

import javax.swing.JOptionPane;

//2. Write a Java method to compute the average of three numbers. Go to the editor
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//
//The average value is 45.0

public class Zadatak31 {
	public static void main(String[] args) {
		

		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost a"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost b"));
		int c =Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost c"));
		
		
		
		
		
		
		ispis(average(a,b,c));
		
		
	}
	
	
	static double average(int a,int b, int c) {
		
		double averageNumber=0;
		int sum=a+b+c;
		
		averageNumber=sum /3;
		
		
		
		
		
		return averageNumber;
	}
	
	
	
	static void ispis(double number) {
		System.out.println(number);
	}

}
