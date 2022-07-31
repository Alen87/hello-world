package alen;

public class SharedDigit {

	public static boolean hasSharedDigit(int a, int b) {
		if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
			return false;
		}

		int aFirstDigit = a / 10;
		int aLastDigit = a % 10;
		int bFirstDigit = b / 10;
		int bLastDigit = b % 10;
		
		if(aFirstDigit == bFirstDigit || aFirstDigit ==bLastDigit || aLastDigit == bFirstDigit || aLastDigit==bLastDigit) {
			return true;
		}else {
			return false;
		}
		
		
		
		

	}

	public static void main(String[] args) {

		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));

	}

}
