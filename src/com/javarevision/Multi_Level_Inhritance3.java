package com.javarevision;

public class Multi_Level_Inhritance3 extends Multi_Level_Inheritance2 {
	private void name3() {
		System.out.println("VK");
	}
public static void main(String[] args) {
	Multi_Level_Inhritance3 a=new Multi_Level_Inhritance3();
	a.name1();
	a.name2();
	a.name3();
}
}
