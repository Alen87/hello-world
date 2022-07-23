package alen;

public class DecimalComparator {
	public static void main(String[] args) {
		
		
		
		System.out.println(areEqualByTreeDecimalPlaces(3.175, 3.176));
	}
	
	
public static boolean areEqualByTreeDecimalPlaces(double num1,double num2) {
		
		
		return(int)(num1 * 1000) == (int)(num2 * 1000)? true:false;
	
	}
}

