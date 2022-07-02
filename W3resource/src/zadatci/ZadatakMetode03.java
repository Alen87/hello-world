package zadatci;

import javax.swing.JOptionPane;

//3. Write a Java method to display the middle character of a string. Go to the editor
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.
//Test Data:
//Input a string: 350
//Expected Output:
//
//                                                                          
//The middle character in the string: 5


public class ZadatakMetode03 {

	public static void main(String[] args) {
		
		String str=JOptionPane.showInputDialog("Unesi vrijednost");
		
		System.out.println(middle(str));
		
		
		
	}
	
	static String middle(String str) {
		
		int position;
		int length;
		if(str.length()%2==0) {
			position=str.length()/2-1;
			length=2;
			
			
		}else {
			position = str.length()/2;
			length = 1;
			
		}
		
		
		
		
		return str.substring(position,position + length);
	}
	
	
	

}
