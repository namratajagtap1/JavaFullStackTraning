package com.yash.array_string_asign;

public class ArrayQuestion3 {
	 private int arr[];
	    private int count;
	    private int sizeOfArray;
	    
	    
	    public ArrayQuestion3()
	    {
	        arr = new int[1];
	        count =0;
	        sizeOfArray =1;
	    }
	    public void addElement(int a)
	    {
	        if(count==sizeOfArray)
	        {
	            growSize();
	            
	        }
	        arr[count] = a;
	        count++;
	        
	    }
	    public void growSize()
	    {
	        int temp[]=null;
	        if(count==sizeOfArray)
	        {
	            temp = new int[sizeOfArray*2];
	            {
	                for(int i=0;i<sizeOfArray;i++)
	                {
	                    temp[i]=arr[i];
	                    
	                }
	            }
	        }
	        arr = temp;
	        sizeOfArray = sizeOfArray *2;
	        
	    }
	     public void addElement(int index, int a)
	     {
	         if(count == sizeOfArray)
	         {
	             growSize();
	         }
	     
	     for (int i = count - 1; i >= index; i--)   
	     {   
	     //shifting all the elements to the left from the specified index  
	     arr[i + 1] = arr[i];   
	     }   
	     //inserts an element at the specified index  
	     arr[index] = a;   
	     count++;   
	}

public static void main(String[] args) {

	ArrayQuestion3 da = new ArrayQuestion3();   
        //adding elements to the array  
        da.addElement(12);   
        da.addElement(22);   
        da.addElement(35);   
        da.addElement(47);   
        da.addElement(85);   
        da.addElement(26);   
        da.addElement(70);   
        da.addElement(81);   
        da.addElement(96);   
        da.addElement(54);  
        System.out.println("Elements of the array:");   
        
        for (int i = 0; i < da.sizeOfArray; i++)   
        {   
        System.out.print(da.arr[i] + " ");   
        }   
        System.out.println();   
        //determines and prints the size and number of elements of the array  
        System.out.println("Size of the array: " + da.sizeOfArray);   
        System.out.println("No. of elements in the array: " + da.count);  
        //invoking the method to add an element at the specified index  
        da.addElement(5, 99); //where 5 is the index number and 99 is the element to be add  
        System.out.println("\nElements of the array after adding an element at index 5:");   
        //iterate over the array for accessing the elements after adding the element at index 5  
        for (int i = 0; i < da.sizeOfArray; i++)   
        {   
        System.out.print(da.arr[i] + " ");   
        }   
        System.out.println();   
        //determines and prints the size and number of elements of the array  
        System.out.println("Size of the array: " + da.sizeOfArray);   
        System.out.println("No. of elements in the array: " + da.count);   



   
}


}

