package com.yash.array_string_asign;

public class ArrayQuestion6 {

	public static void main(String args[]) {
		int[] intarray = { 89, 60, 52, 70, 40, 10 };
		int i = 0;
		int j = 0;
		int temp = 0;
		int midNumber = intarray.length % 2 == 0 ? intarray.length / 2 : (intarray.length / 2) + 1;
		System.out.println("Descending order ");
		for (i = 0; i < intarray.length; i++) {
			for (j = 0; j < intarray.length; j++) {
				if (intarray[i] > intarray[j]) {
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}

		}

		for (int k = 0; k < midNumber; k++) {
			System.out.println(intarray[k]);
		}

		for (i = 0; i < intarray.length; i++) {
			for (j = 0; j < intarray.length; j++) {
				if (intarray[i] < intarray[j]) {
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}

		}
		int d = intarray.length % 2 == 0 ? intarray.length / 2 : (intarray.length / 2);
		System.out.println("Ascending order ");
		for (int k = 0; k < d; k++) {
			System.out.println(intarray[k]);
		}

//    System.out.println(Arrays.toString(intarray));

	}

}
