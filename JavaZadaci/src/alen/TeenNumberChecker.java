package alen;

public class TeenNumberChecker {
	public static void main(String[] args) {
		
		System.out.println(hasTeen(23,23,34));
		System.out.println(isTeen(13));
		
	}
	
	public static boolean hasTeen(int a,int b,int c) {
		
		if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19) ) {
			return true;
		}else {
			return false;
		}
		
		
		
		
	}
	
	
	
	public static boolean isTeen(int a) {
		
		
		
		
		return a>=13 && a<=19 ? true:false;
		
	}
	
	
	

}
