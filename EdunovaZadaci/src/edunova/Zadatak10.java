package edunova;



//Za dani jednodimenzinalni niz
	// cjelih brojeva program ispisuje 
	// najve�i



public class Zadatak10 {
public static void main(String[] args) {
	
	int[] niz = {5,5,8,6,-6,8,-1,0,9,0};
	// 9
	
	
	
	int max= Integer.MIN_VALUE;
	
	for(int i=0;i <niz.length;i++) {
		if(niz[i] > max) {
			max=niz[i];
		}
		
	}
	
	System.out.println(max);
}
	
	
	
}
