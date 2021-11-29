package com.string;

public class Immutable {
	public static void main(String[] args) {
		String s="vikey";
		String b="vikey";
		int identityHashCode=System.identityHashCode(s);
		System.out.println("memory of s : "+ identityHashCode);
		System.out.println("memory of b : "+ System.identityHashCode(b));
		String concat = s.concat(b);
		System.out.println("concat string is :"+concat);
		System.out.println("concat memory is :"+System.identityHashCode(concat));
	}

}
