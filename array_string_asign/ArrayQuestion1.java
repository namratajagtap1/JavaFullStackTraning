package com.yash.array_string_asign;

public class ArrayQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {7,8,54,23,12};
int temp;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
System.out.println(arr[arr.length-3]);

}
	}


