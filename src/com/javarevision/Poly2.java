package com.javarevision;

public class Poly2 extends Poly1
{
	private void product2()
	{
		System.out.println("Phone");
	}
	private void product3()
	{
		System.out.println("Pen");
	}
	public static void main (String []args)
	{
		Poly2 a=new Poly2();
		a.product("chair");
		a.product1();
		a.product2();
		a.product3();
		
	}

}
