package com.javarevision;

import com.sun.javafx.scene.traversal.Hueristic2D;

public class Hier_Child3 extends Hierarchical_Inhritance {
	private void student1() {
		System.out.println("student 1: SK");
	}

	private void student2() {
		System.out.println("Student1 : TM");
	}

	public static void main(String[] args) {
		Hierarchical_Inhritance a = new Hierarchical_Inhritance();
		Hier_Child1 b = new Hier_Child1();
		Hier_Child2 c = new Hier_Child2();
		Hier_Child3 d = new Hier_Child3();
		a.sports();
		b.player1();
		b.player2();
		a.Stsrs();
		c.actor1();
		c.actor2();
		a.School();
		d.student1();
		d.student2();

	}
}
