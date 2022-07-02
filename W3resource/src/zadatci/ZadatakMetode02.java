package zadatci;

import javax.swing.JOptionPane;

//2. Write a Java method to compute the average of three numbers. Go to the editor
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//
//The average value is 45.0

public class ZadatakMetode02 {
public static void main(String[] args) {
	
	try {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost a"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost b"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost c"));
		ispis(average(a,b,c));
		
		
	} catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Niste  unijeli  cijeli  broj");   
	}
	
	
	
	
}
  static double average(int a,int b,int c) {
	  
	 
	  
	  double average= (a+b+c)/(double)3;
	  
	   return average;
  }


  static double ispis(double broj) {
	  
	  System.out.println(" Average  number of three inputs is " + broj);
	  
	  return broj;
  }
  
  
  
  


}
