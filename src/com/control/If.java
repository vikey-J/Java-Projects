package com.control;

public class If {
	public static void main(String[] args) {
		int mark = 37;
		if (mark >= 80 && mark <= 100) {
			System.out.println("first class");
		} else if (mark >= 35 && mark <= 80) {
			System.out.println("Average");
		} else {
			System.out.println("fail");
		}
	}
}
