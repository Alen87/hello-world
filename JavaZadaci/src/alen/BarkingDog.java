package alen;

public class BarkingDog {
public static void main(String[] args) {
	
	
	System.out.println(shouldWakeUp(true,-1));
	
}
	
 public	static boolean shouldWakeUp(boolean barking,int hourOfDay) {
	 
	return ((((hourOfDay >0) && (hourOfDay < 8)) || (hourOfDay > 22) && (hourOfDay<=23)) && (barking)) ?true:false;
		
} 
}
	 
 	 
	 
	

