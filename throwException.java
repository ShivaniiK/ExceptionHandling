package com.ExceptionHandling;                //ThrowException

public class throwException {
		
	    //defining a method  
	    public void checkNum(int num) {  
	    	
	        if (num < 1) {  
	        	
	            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
	        }  
	        
	        else {  
	        	
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	    }  
	}

