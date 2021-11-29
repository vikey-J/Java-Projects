package com.javarevision;

public class Abstrction2  extends Abstraction1
{
	@Override
	public void password() {
		System.out.println("vikey123");
	}
  public static void main (String []args)
  {
	  Abstrction2 a=new Abstrction2();
	  a.name();
	  a.email();
	  a.password();
  }
  
	

}
