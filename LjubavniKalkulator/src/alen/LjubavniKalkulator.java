package alen;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {
	public static void main(String[] args) {
		String ime1 = "Marta", ime2 = "Manuel";

		String zbrojImena = ime1 + ime2;

		int[] niz = new int[zbrojImena.length()];

		int count = 0;

		for (int i = 0; i < zbrojImena.length(); i++) {
			count = 0;
			for (int j = 0; j < zbrojImena.length(); j++) {
				if (zbrojImena.toLowerCase().charAt(i) == zbrojImena.toLowerCase().charAt(j)) {
					count++;
				}
			}
			niz[i] = count;
		}

		System.out.println(Arrays.toString(niz));

		// imam cijeli niz
		// sad ga treba  razdijeliti

		int[] niz1 = new int[ime1.length()];
		int[] niz2 = new int[ime2.length()];

		for (int i = 0; i < niz.length; i++) {

			if (i < ime1.length()) {
				niz1[i] = niz[i];
			} else if (i >= ime1.length()) {
				niz2[i - ime1.length()] = niz[i];
			}
		}

		System.out.println();
		System.out.println(  "    "+ ime1 + "               " + ime2);
		System.out.print(Arrays.toString(niz1) + "    " + Arrays.toString(niz2));
		
		// reverseArray ime2
		
		 int maxIndex = niz2.length - 1;
	        int polovicaNiza = niz2.length / 2;
	        for(int i=0;i<polovicaNiza;i++){
	            int temp=niz2[i];
	            niz2[i]=niz2[maxIndex-i];
	            niz2[maxIndex-i]=temp;
	            System.out.println();
	        } 
        System.out.println(Arrays.toString(niz2));
      
	}

}
