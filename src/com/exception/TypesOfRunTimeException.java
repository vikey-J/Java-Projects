package com.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypesOfRunTimeException {

	public static void main(String[] args) {
		// ArithmeticException
		// int a=10;
		// System.out.println(a/0);

	//	 NullpointException
//		 String s=null;
//		 System.out.println(s.length());

		// InputMismatchException
//		 Scanner s=new Scanner(System.in);
//		 int nextInt = s.nextInt();
//		 System.out.println(nextInt);

		// ArrayIndexOutOfBoundException
//		 int a[]=new int[10];
//		 System.out.println(a[77]);

		// StringIndexOutOfBoundException
//		 String a="java";
//		 char charAt = a.charAt(4);
//		 System.out.println(charAt);

		// IndexOutOfBound
//		 List<Integer> a=new ArrayList<Integer>();
//		 a.add(100);
//		 Integer integer = a.get(1);
//		 System.out.println(integer);

		// NumberFormatException
		String s="vikey";
		int parseInt = Integer.parseInt(s);
		System.out.println(s);
				}

}
