package com.javarevision;

public class Interface_Child implements Interface1, Interface2 {
	//Unimplementation method

	@Override
	public void person3() {
		System.out.println("dengu");
	}

	@Override
	public void person4() {
		System.out.println("maleria");
	}

	@Override
	public void person1() {
		System.out.println("hiv");
	}

	@Override
	public void person2() {
		System.out.println("eids");
	}

	public static void main(String[] args) {
		Interface_Child a = new Interface_Child();
		a.person1();
		a.person2();
		a.person3();
		a.person4();

	}

}
