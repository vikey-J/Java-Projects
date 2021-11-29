package com.scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);

		System.out.println("Enter a single String : ");
		String next = sc.next();
		System.out.println(next);

		System.out.println("Enter a Integer : ");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);

		System.out.println("Enter a Float : ");
		float nextFloat = sc.nextFloat();
		System.out.println(nextFloat);

		System.out.println("Enter a Character : ");
		char charAt = sc.next().charAt(0);
		System.out.println(charAt);
	}

}
