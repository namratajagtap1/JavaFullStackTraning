/**
 * 
 */
package com.yash.oopsasignment6;

/**
 * @author namrata.jagtap
 *
 */
public class MaxNumber implements MaxInterFace {

	@Override
	public int maxOfThirdNo() {
		int arr[]= {3,4,5,6,7};
		int temp ,size= arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[size-3];
	}
	@Override
	public int maxOfFourthNo() {
		int arr[]= {3,4,5,6,7};
		int temp ,size= arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[size-4];
	}
	
	@Override
	public int maxOfNNo(int n) {

		int large,size;
		int[] arr = new int[n];
		size=arr.length;
		for(int i=0;i<n;i++)
		{
			for( int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					large = arr[i];
					arr[i]= arr[j];
		     		arr[j] = large;
				}
			}
		}
		return arr[size-n];
	}


	public static void main(String[] args) {
MaxNumber m = new MaxNumber();
		
		int maxThird=m.maxOfThirdNo();
		System.out.println("Maximum of Third Number:"+maxThird);
		int maxFourth = m.maxOfFourthNo();
		System.out.println("Maximum of Fourth Number:"+maxFourth);
		
		int max = m.maxOfNNo(10);
		System.out.println("no is n :"+max);

	}

}
