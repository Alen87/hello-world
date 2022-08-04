package alen;

public class NumberToWords {

	public static void numberToWords(int number) {
		// Check if Valid
		if (number < 0) {
			System.out.println("Invalid Value");
			return;
		}
		
		// Reverse 
		int reversed = reverse(number);
		// Digit Count
		int digits = getDigitCount(number);
		
		// For Loop
		for(int i=reversed; digits != 0; i/=10) {
			int lastDigit = i%10;
			
			// Print last digit
			switch(lastDigit) {
			case 0:
				System.out.println("Zero");
				break;
				
			case 1:
				System.out.println("One");
				break;
				
			case 2:
				System.out.println("Two");
				break;
				
			case 3:
				System.out.println("Three");
				break;
				
			case 4:
				System.out.println("Four");
				break;
				
			case 5:
				System.out.println("Five");
				break;
				
			case 6:
				System.out.println("Six");
				break;
				
			case 7:
				System.out.println("Seven");
				break;
				
			case 8:
				System.out.println("Eight");
				break;
				
			case 9:
				System.out.println("Nine");
				break;
				
			}
			digits--;
		}
		
	}
	
 
	/*
	 * @returns digit count
	 */
	public static int getDigitCount (int number) {
		// Check if Valid
		if (number < 0) return -1;
		
		// Digit Counter
		int digit = 0;
		do {
			digit++;
			number/=10;
		}while(number != 0);
		
		return digit;
	}
	
	/*
	 * @returns reversed number.
	 */
	
	public static int reverse(int number) {
		int reversed = 0;
		for(int i=number; i != 0; i/=10) {
			reversed = reversed*10 + i%10;
		}
		return reversed;
	



}
	public static void main(String[] args) {
		numberToWords(5678);
	}
}
