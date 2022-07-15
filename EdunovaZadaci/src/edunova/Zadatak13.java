package edunova;

import java.util.Arrays;

//Deklarirajte niz decimalnih
	// brojeva dužine 12 i svim elementima
	// niza postavite vrijednost 3,14
	// s while petljom
	

public class Zadatak13 {
	public static void main(String[] args) {
		
		double[]niz=new double[12];
		int i=0;
		
		while(i<niz.length) {
			
			niz[i]=3.14;
			i++;
		}
		
		
		System.out.println(Arrays.toString(niz));
		
		
	}

}
