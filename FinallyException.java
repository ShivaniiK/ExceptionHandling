package com.ExceptionHandling;

public class FinallyException {

	public static void finalException() {
	 //try block 
    try
    {
        System.out.println ("::Try Block::");
        int data = 125 /0;
        System.out.println ("Result:" + data);
    } 
    //catch block
    catch (NullPointerException e) {
        System.out.println ("::Catch Block::");
        System.out.println (e);
    } 
    //finally block
    finally {
        System.out.println ("Finally Block::");
        System.out.println ("No Exception::finally block executed");
    } 
    System.out.println ("rest of the code...");
} 
}
