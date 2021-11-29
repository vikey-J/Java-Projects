package com.javarevision;

import java.util.Scanner;

// It is a class
// Scanner class present in java.util.package;
// to get the input from the user or run-time.
// syntax:
//     Scanner referenceName=new Scanner(System.in);

public class Scannerr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Accept more than one value after the space

		System.out.println("Enter a string : ");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);

		// accept the one value. after the space it won't accept

		System.out.println("Enter a string :");
		String next = sc.next();
		System.out.println(next);

		// it accept integer value like whole number

		System.out.println("Enter the integer :");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);

		// accept decimal value value only

		System.out.println("Enter the Float :");
		float nextFloat = sc.nextFloat();
		System.out.println(nextFloat);
		
		//it is index based,so accept one letter int this word 
		
        System.out.println("Enter the String(Char) :");
		char charAt = sc.next().charAt(0);
		System.out.println(charAt);
	}

}
