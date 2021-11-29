package com.javarevision;

   //  In the same class the method name will be same 
   //  But arguments (or) parameter will be different 
   //  it is also known as complile time polymorphism or static binding 


public class Polymorphism 
{
	private void student(String name)
	{
		System.out.println(name);
	}
	private void stuudent(int age)
	{
		System.out.println(age);
	}
	private void student(char gender)
	{
		System.out.println(gender);
	}
	public static void main (String []args)
	{
		Polymorphism a=new Polymorphism();
		a.student("VKJ");
		a.stuudent(21);
		a.student('M');
	}

}
