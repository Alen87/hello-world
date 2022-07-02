package zadatci;

import javax.swing.JOptionPane;

//4. Write a Java method to count all vowels in a string. Go to the editor
//Test Data:
//Input the string: w3resource
//Expected Output:
//
//Number of  Vowels in the string: 4
//Click me to see the solution

public class ZadatakMetode04 {
	public static void main(String[] args) {
		
		String str=JOptionPane.showInputDialog("Say words");
		System.out.println("Number od vowels in the  string " + countVowels(str)+ "\n");

	}

	static int countVowels(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			
		if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
				|| str.charAt(i) == 'u') {
				count++;

			}
		}

		return count;
	}

}
