package alen;

public class NumberToWords2 {
	
//	public static numberToWords(int number) {
//		
//		if(number < 0) {
//			System.out.println("Invalid Value");
//		}
//		
//}
//	
public static int reverse(int number) {
	int remainder=0;
	int reverse=0;
	
	while(number!=0) {
		
		remainder=number%10;
		reverse=(reverse*10) + remainder;
		number/=10;
		
		
		//System.out.println(reverse);
	}
	
	
	return reverse;
	
	
}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(reverse(-121));
		
		
		

	}

}
