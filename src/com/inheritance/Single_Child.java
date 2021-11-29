package com.inheritance;

public class Single_Child extends Single_Parent {
	private void name1() {
		System.out.println("child");

	}
		public static void main(String[] args) {
		Single_Child a=new Single_Child();
		a.name();
		a.name1();
	}

}
