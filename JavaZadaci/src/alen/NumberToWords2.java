package alen;

public class NumberToWords2 {

	public static void numberToWords(int number) {

		if (number < 0) {
			System.out.println("Invalid Value");
		}

		int reversed = reverse(number);
		int count = getDigitCount(number);
		int lastDigit = 0;

		while (count > 0) {

			lastDigit = reversed % 10;
			reversed /= 10;

			switch (lastDigit) {
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

			count--;

		}

	}

	public static int reverse(int number) {
		int remainder = 0;
		int reverse = 0;

		while (number != 0) {

			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number /= 10;

		}

		return reverse;

	}

	public static int getDigitCount(int number) {

		if (number < 0) {
			return -1;
		}

		int count = 0;

		do {
			number /= 10;
			count++;
		} while (number > 0);

		return count;

	}

	public static void main(String[] args) {

		System.out.println(reverse(-121));
		System.out.println(reverse(1212));
		System.out.println(reverse(1234));
		System.out.println(reverse(100));

		System.out.println();

		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(123));
		System.out.println(getDigitCount(-12));
		System.out.println(getDigitCount(5200));

		System.out.println();

		numberToWords(123);
		System.out.println();
		numberToWords(1010);
		System.out.println();
		numberToWords(1000);
		System.out.println();
		numberToWords(-12);
	}

}
