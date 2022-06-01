package com.ExceptionHandling;         //ThrowssException

public class Throwsss {

		  static void checkAge(int age) throws ArithmeticException {
			  
		    if (age < 18) {
		    	
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		    	
		      System.out.println("Access granted - You are eligible to Vote!");
		      
		    }
		    
		  }

}
