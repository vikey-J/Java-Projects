package com.test;

public class Hier_Child3 extends Hier_Parent {
	private void student() {
		System.out.println("Student 1: 1");
	}

	private void STudent2() {
		System.out.println("Student 2: 2");
	}
	@Override
	public void college() {
		super.college();
	}

	public static void main(String[] args) {
		Hier_Parent a = new Hier_Parent();
		Hier_Child1 b = new Hier_Child1();
		Hier_Child2 c = new Hier_Child2();
		Hier_Child3 d = new Hier_Child3();
		a.sports();
		b.player1();
		b.player2();
		a.stars();
		c.actor1();
		c.actor2();
		a.college();
		d.student();
		d.STudent2();
	}

}
