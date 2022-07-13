package vjezba;

//3. Write a Java method to display the middle character of a string. Go to the editor
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.
//Test Data:
//Input a string: 350
//Expected Output:
//
//                                                                          
//The middle character in the string: 5


public class Zadatak32 {
	public static void main(String[] args) {
		
		System.out.println(middle("350"));
		
	}
	
	
	public static String middle(String poruka) {
		
		int position;
		int length;
		
		if(poruka.length()%2==0) {
			position=poruka.length()/2-1;
			length=2;
		}else {
			position=poruka.length()/2;
			length=1;
		}
		
		
		
		return poruka.substring(position,position + length);
	}

}
