package com.exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		
	//ArithmeticException
		
	int a=1000;
	try {
		System.out.println(a/0);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Exception Handled");
	}

}
