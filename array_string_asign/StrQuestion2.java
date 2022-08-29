package com.yash.array_string_asign;
//assignment 2
public class StrQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="java";
char arr[]=str.toCharArray();
char temp;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}

System.out.println(new String(arr));
	}

}
