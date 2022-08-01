package alen;

import java.util.Arrays;

public class SumFirstAndLastElement {

	public static void sumFirstAndLastElement(int[] niz) {
		int sum=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int middle=0;
		int sum5 =0;
		int sum6=0;
		int middle2=0;
		int middle3=0;
		int sum7=0;
		
		
	
		
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
			 middle = niz[niz.length - 1] / 2;

		}
		int[] sumOfSum = { sum, sum2, sum3, sum4, middle };

		for (int i = 0; i < sumOfSum.length; i++) {
			sum5 = sumOfSum[0] + sumOfSum[sumOfSum.length - 1];
		}

		for (int i = 0; i < sumOfSum.length; i++) {
			 sum6 = sumOfSum[0 + 1] + sumOfSum[sumOfSum.length - 2];
		}

		for (int i = 0; i < sumOfSum.length; i++) {
			middle2 = sumOfSum[sumOfSum.length - 1] / 2;

		}
		int[] sumOfSum2 = { sum5, sum6, middle2 };
		
		for(int i=0;i<sumOfSum2.length;i++) {
			 sum7=sumOfSum2[0] + sumOfSum2[sumOfSum2.length -1];
		}
		
		for (int i = 0; i < sumOfSum2.length; i++) {
			middle3 = sumOfSum2[sumOfSum2.length - 1] / 2;
		}
		
		int[]sumOfSum3= {sum7,middle3};

		System.out.println(Arrays.toString(sumOfSum));
		System.out.println(Arrays.toString(sumOfSum2));
        System.out.println(Arrays.toString(sumOfSum3));
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

		System.out.println(Arrays.toString(array));
		sumFirstAndLastElement(array);

	}

}
