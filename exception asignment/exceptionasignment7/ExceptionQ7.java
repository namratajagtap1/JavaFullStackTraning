package com.yash.exceptionasignment7;

/*Chained Exceptions allows to relate one exception with another exception,
*  i.e one exception describes cause of another exception.
*  For example, consider a situation in which a method throws an
*  ArithmeticException because of an attempt to divide by zero
*  but the actual cause of exception was an I/O error which caused the divisor to be zero.
*  The method will throw only ArithmeticException to the caller.
*   So the caller would not come to know about the actual cause of exception.
*    Chained Exception is used in such type of situations.



Constructors Of Throwable class Which support chained exceptions in java :



Throwable(Throwable cause) :- Where cause is the exception that causes the current exception.
Throwable(String msg, Throwable cause) :- Where msg is the exception message and cause is the exception that causes the current exception.
Methods Of Throwable class Which support chained exceptions in java :



getCause() method :- This method returns actual cause of an exception.
initCause(Throwable cause) method :- This method sets the cause for the calling exception.*/
public class ExceptionQ7
{
   public static void main(String[] args)
    {
     try
      {
         //creating exception
         NumberFormatException ex =  new NumberFormatException("Exception");
         
         //setting cause to exception
         ex.initCause(new NullPointerException("This is Acutal Exception"));
         
         //throwing an exception with cause
         throw ex;
         
      }
      catch (NumberFormatException e)
      {
        //Display the exception
          System.out.println(e);
          
          //Getting the actual cause of the exception
          System.out.println(e.getCause());
          
          
      }    
    }
}