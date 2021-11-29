package com.javarevision;

   // class name and constructor name is same 
   // when we create an object for a class the default constructor will be 
   // -executed automatically at the itself
   // it will not have any return type
   // It will support method overloading and 
   // does not support method overriding
   // types --> 1.Default constructor(or)non-parameterized constructor(or)no-argument constructor 
   //  2.parameterized constructor 
   // Garbage collection [ using finalizing() method to remove garbage value ]

public class Constructor {
	
	// Default Constructor 
	
	public Constructor ()
	{
		System.out.println("Default Constructor");
	}
    public Constructor(String name)
    {
    	this();
    	System.out.println(name);
    }
    public Constructor(int age)
    {
    	this("vk");
    	System.out.println(age);
    }
    public Constructor (char gender)
    {
    	this(21);
    	System.out.println(gender);
    }
    public static void main(String []args) throws Throwable 
    {
    Constructor a=new Constructor('M');
//    Constructor b=new Constructor("vikey");
//    Constructor c=new Constructor(21);
//    Constructor d=new Constructor('M');
//    a.finalize();
//    b.finalize();
//    c.finalize();
//    d.finalize();
    
    
    
    }
}
