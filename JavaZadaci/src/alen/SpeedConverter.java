package alen;

public class SpeedConverter {
	public static void main(String[] args) {
		printConversion(10.25);

	}

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			return -1;
		} else {
			return Math.round(kilometersPerHour / 1.609);
		}

	}

	public static void printConversion(double kilometersperHour) {
		long miles = 0;
		if (kilometersperHour < 0) {
			System.out.println("Invalid Value");
		} else {
			miles = toMilesPerHour(kilometersperHour);
			System.out.println(kilometersperHour + "km/h = " + miles + " mi/h ");
		}

	}

}
