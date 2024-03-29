package alen;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {

		System.out.println(getDaysInMonth(1,2020));
		System.out.println(getDaysInMonth(2,2020));
		System.out.println(getDaysInMonth(2,2018));
		System.out.println(getDaysInMonth(-1,2020));
		System.out.println(getDaysInMonth(1,-2020));
	}

	public static boolean isLeapYear(int year) {
		if ((year >= 1) && (year <= 9999)) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
				return true;
			}
		}
		return false;

	}

	public static int getDaysInMonth(int month, int year) {

		int daysInMonth;

		if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
			return -1;
		} else {
			switch (month) {
			case 2:
				daysInMonth = isLeapYear(year) ? 29 : 28;
				break;
			case 9:
			case 4:
			case 6:
			case 11:
				daysInMonth = 30;
				break;
			default:
				daysInMonth = 31;
				break;
			}
		}

		return daysInMonth;
	}

}
