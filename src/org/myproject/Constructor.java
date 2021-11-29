package org.myproject;

public class Constructor {
	// Default Constructor
	public Constructor() {
		System.out.println("Default Constructor");
	}

	// parameterized Constructor-1 Parameter
	public Constructor(String name) {
		this();
		System.out.println(name);
	}

	// parameterized Constructor-1 Parameter
	public Constructor(int age) {
		this("vk");
		System.out.println(age);
	}

	public Constructor(char gender) {
		this(22);
		System.out.println(gender);
	}

	public static void main(String[] args) throws Throwable {
		Constructor a = new Constructor('m');
//		Constructor b=new Constructor("vikey");
//		Constructor c=new Constructor(21);
//		Constructor d=new Constructor('M');
//		a.finalize();
//		b.finalize();
//		c.finalize();
//		d.finalize();

	}
}
