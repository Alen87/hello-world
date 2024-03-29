package alen;

import java.util.Scanner;

/*Input Calculator
Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.



EXAMPLES OF INPUT/OUTPUT:

EXAMPLE 1:

INPUT:

1
2
3
4
5
a
OUTPUT

SUM = 15 AVG = 3



EXAMPLE 2:

INPUT:

hello

OUTPUT:

SUM = 0 AVG = 0



TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.
*/
public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {

		Scanner scanner = new Scanner(System.in);

		int number = 0;
		int sum = 0;
		double count = 0;
		double average = 0;

		while (true) {

			boolean ifHasNext = scanner.hasNextInt();
			if (ifHasNext) {
				number = scanner.nextInt();
				sum += number;
				count++;
				average = sum / count;

			} else {
				System.out.println("SUM = " + sum + " AVG = " + (long) Math.round(average));
				break;
			}
			
		}
		scanner.close();
	}

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

}
