package alen;

public class MinutesToYearsAndDaysCalculator {
	public static void main(String[] args) {
		
		
		printYearsAndDays(561600);
		
		

	}

	public static void printYearsAndDays(long minutes) {
		if(minutes <0) {
			System.out.println("Invalid Value");
		}

		long daystotal = (minutes / 60) / 24;
		long years = daystotal / 365;
		long days = daystotal % 365;
		
		System.out.println(minutes + " min= " + years + "y and " + days+ "d");
		
		

	}

}
