package com.ExceptionHandling;             trycatchexception

public class ExceptionHandleExample {

	public void arithmeticCalculation()
	{
	int intNum = 40;
	int intNum2 =0;
	int intResult;
	try
	{
	intResult = intNum/intNum2;
	System.out.println("This is example of Arithmetic exception." +intResult);

	} catch (Exception arth)
	{
		System.out.println("===========");
	}
	{
	System.out.println("Can't divide by Zero...");
	}
	System.out.println("===========");
	}

	public void nullpointerException()
	{
	try
	{
	String strapple = null;
	System.out.println("This is an example of null pointer." +strapple.charAt(2));
	} catch (Exception point)
	{
	System.out.println("Null Pointer Exception.");
	}


	}
}
