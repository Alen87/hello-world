package alen;

public class EvenDigitSum {

	public static int getEvenDigitSum(int number) {

		int sum = 0;
		int remaindNumber;

		if (number < 0) {
			return -1;
		}
		while (number > 0) {
			remaindNumber = number % 10;
			number /= 10;

			if (remaindNumber % 2 == 0) {
				sum += remaindNumber;
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
