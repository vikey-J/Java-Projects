package com.hierarchical;

public class Child3 extends Hier_Parent {
	private void student1() {
		System.out.println("Student1 is : Ajith");
	}

	private void student2() {
		System.out.println("Student2 is: Vikey");
	}

public static void main(String[] args) {
	Child1 a=new Child1();
	Child2 b=new Child2();
    Child3 c=new Child3();
	a.sports();
	a.player1();
	a.player2();
	b.stars();
	b.actor1();
	b.actor2();
	c.school();
	c.student1();
	c.student2();
	
}
}
