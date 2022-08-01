package alen;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int first,int second) {
		if((first < 10) || (second<10)) {
			return-1;
		}
		int lower=Math.min(first, second);
		int remainder=0;
		for(int i=1;i <=lower;i++ ) {
			if ((first % i == 0) && (second % i == 0)) {
				remainder=i;
			}
		}
		
	
		return remainder;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(getGreatestCommonDivisor(25, 15));
		
	}
	
	
	
}
