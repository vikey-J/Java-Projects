package com.typecasting;

public class Child extends Parent{
	private void child() {
System.out.println("Child");
	
	}
	public static void main(String[] args) {
		Parent p=new Child();   //Upcasting 
		p.parent();
		
//		Child c=new Parent(); //Downcasting [ it's not possible java ]
//		c.child();
		
	}

}
