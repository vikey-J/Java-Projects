package com.javarevision;

public class Vaeriables {
	static String a = "VK";  //static variable 
	static String c;    

	public static void add() {
		int b = 10;           //local variable 
		System.out.println(b);
	}
	public static void sub() {
		System.out.println(c);
	}
public static void main(String[] args) {
	System.out.println(a);
	add();
	sub();
}
}
