package alen;

public class EvenDigitSum {

	public static int getEvenDigitSum(int number) {

		int sum = 0;
		int remindNumber = 0;

		if (number < 0) {
			return -1;
		}

		while (number > 0) {
			remindNumber = number % 10;
			number /= 10;

			if (remindNumber % 2 == 0) {
				sum += remindNumber;
			}

		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));

	}

}
