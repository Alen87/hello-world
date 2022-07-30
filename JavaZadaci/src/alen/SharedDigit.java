package alen;



public class SharedDigit {

	public static boolean hasSharedDigit(int number1, int number2) {

		if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
			return false;
		}
		int num1LastDigit = number1 % 10;
		int num1FirstDigit = number1 / 10;
		int num2FirstDigit = number2 % 10;
		int num2LastDigit = number2 / 10;
		

		return num1FirstDigit == num2FirstDigit || num1FirstDigit == num2LastDigit || num1LastDigit == num2FirstDigit
				|| num1LastDigit == num2LastDigit;

	}

	public static void main(String[] args) {

		System.out.println(hasSharedDigit(12, 23));
		
	}

}
