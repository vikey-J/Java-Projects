package com.control;

public class Switch {
	public static void main(String[] args) {
		String day="sunday";
		switch (day) {
		case "sunday": 
			System.out.println("1st day");
			break;
		case "monday":
			System.out.println("2nd day");
			break;
			
		
		default:
			System.out.println("error");
		break;
		}
	}

}
