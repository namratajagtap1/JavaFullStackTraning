package com.yash.array_string_asign;

public class ArrayQuestion7 {
	
	
 public static void main(String[] args) {
	int[] arr = { 25, 50, 75, 125, 625 };
	int min, max, x, lcm=0, hcf=0;

	for(
	int i = 0;i<arr.length;i++)
	{
		for (int j = i + 1; j < arr.length - 1; j++) {
			if (arr[i] > arr[j]) {
				min = arr[j];
				max = arr[i];
			} else {
				min = arr[i];
				max = arr[j];
			}
			for (int k = 0; k < arr.length; k++) {
				x = k * max;
				if (x % min == 0) {
					lcm = x;
				}
			}

		}

	}System.out.println("LCM of the given array of numbers : "+lcm);
}
// Find HCF

// System.out.println("HCF of the given array of numbers : " + hcf);

}
