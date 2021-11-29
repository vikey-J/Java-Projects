package com.statickeyword;

public class Emp {
	int eid;
	int salary;
	static String ceo;



public Emp() {   //when you create an object
	eid=1;
	salary=15000;
	System.out.println("Constructor");
	  
}
static {      //when you load a class
	ceo="VK";
   System.out.println("Static");
}
public void show() {  
	System.out.println(eid+ ":"+ salary +":"+ ceo);
}
public static void main(String[] args) {
	Emp a=new Emp();
	Emp b=new Emp();
	a.show();
	b.show();
}
}
