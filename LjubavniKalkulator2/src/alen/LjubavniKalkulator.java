package alen;

import java.util.Arrays;



public class LjubavniKalkulator {
	public static void main(String[] args) {
		String ime1 = "Marta", ime2 = "Manuel";

		String zbroj = ime1.toLowerCase().trim() + ime2.toLowerCase().trim();

		int[] niz = new int[zbroj.length()];

		int count;

		for (int i = 0; i < zbroj.length(); i++) {
			count = 0;
			for (int j = 0; j < zbroj.length(); j++) {
				if (zbroj.charAt(i) == zbroj.charAt(j)) {
					count++;
				}
			}
			niz[i] =count;
			
		}

		

		// imam cijeli niz
		// sad ga treba razdijeliti

		int[] niz1 = new int[ime1.length()];
		int[] niz2 = new int[ime2.length()];

		for (int i = 0; i < niz.length; i++) {

			if (i < ime1.length()) {
				niz1[i] = niz[i];
			} else if (i >= ime1.length()) {
				niz2[i - ime1.length()] = niz[i];
			}
		}


		System.out.printf("%4s %s %15s %s", "", ime1, "", ime2);
		System.out.println();
		System.out.print(Arrays.toString(niz1) + "    " + Arrays.toString(niz2));
		System.out.println();
		System.out.printf("%1s %s","", Arrays.toString(niz));
		int sum=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		int middle=0;
		int sum6=0;
		int sum7=0;
		int sum8=0;
		int sum9=0;
		int middle2=0;

		for (int i = 0; i < niz.length; i++) {
			 sum = niz[0] + niz[niz.length - 1];

		}
		for (int i = 0; i < niz.length; i++) {
			 sum2 = niz[0 + 1] + niz[niz.length - 2];

		}
		for (int i = 0; i < niz.length; i++) {
			 sum3 = niz[0 + 2] + niz[niz.length - 3];

		}
		for (int i = 0; i < niz.length; i++) {
			sum4 = niz[0 + 3] + niz[niz.length - 4];

		}
		for (int i = 0; i < niz.length; i++) {
			sum5 = niz[0 + 4] + niz[niz.length - 5];

		}
		
		for (int i = 0; i < niz.length; i++) {
			 middle = niz[0] + (niz[niz.length - 1] - niz[0]) /2;

		}
		int[] sumOfSum = { sum, sum2, sum3, sum4,sum5, middle };
		System.out.println();
        System.out.printf("%6s %s","", Arrays.toString(sumOfSum));
		
        for (int i = 0; i < sumOfSum.length; i++) {
			 sum6 = sumOfSum [0] + sumOfSum[sumOfSum.length - 1];

		}
		
        for (int i = 0; i < sumOfSum.length; i++) {
			 sum7 = sumOfSum[0+1] + sumOfSum [sumOfSum.length - 2];

		}
        for (int i = 0; i < sumOfSum.length; i++) {
			 sum8 = sumOfSum[0+2] + sumOfSum[sumOfSum.length - 3];

		}
        int[] sumOfSum2 = { sum6, sum7, sum8 };
        System.out.println();
        System.out.printf("%9s %s","", Arrays.toString(sumOfSum2));
        
        for (int i = 0; i < sumOfSum2.length; i++) {
			 sum9 = sumOfSum2 [0] + sumOfSum2[sumOfSum2.length - 1];

		}
        
        for(int i = 0; i < sumOfSum2.length; i++) {
        	 middle2 =sumOfSum2[0] + (sumOfSum2[sumOfSum2.length - 1] - sumOfSum2[0]) /2;
        	 
        }
        
        int[]sumOfSum3={sum9 , middle2};
        System.out.println();
        System.out.printf("%11s %s","",Arrays.toString(sumOfSum3));
		
		}

	}

