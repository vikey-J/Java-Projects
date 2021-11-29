package com.multilevel;

public class Class3 extends Class2{
	private void child() {
System.out.println("Vikey");
	}
	public static void main(String[] args) {
		Class3 a=new Class3();
		a.grantparent();
		a.parent();
		a.child();
		
	}

}
