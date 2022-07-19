package edunova;

//Kreirati privatnu metodu tipa int koja vraæa 
//sve pojavnosti slova a u primljenom stringu


public class Zadatak23 {
public static void main(String[] args) {
	
	
		System.out.println(metoda("njkfhnaaaakljkjfjuaaa"));
		
		
	}




private static int metoda(String s) {
	int ukupno=0;
	
	for(int i=0;i<s.length();i++) {
	if(s.charAt(i) == 'a' ) {
		ukupno++;
	}
	}
	
	return ukupno;
	
	
}
	
	
	
}
