/**
 * 
 */
package com.yash.exceptionque3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author namrata.jagtap
 *
 */
public class ExceptionQ3 {

	
	 public static void main(String[] args) throws IOException
     {
         System.out.println("Enter Name: ");
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in)))
        {
            String str =br.readLine();
            System.out.println(str);
        }
        catch (Exception e)
        {
           System.out.println(e);         
        }
                

}
}
