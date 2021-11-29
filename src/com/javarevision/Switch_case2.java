package com.javarevision;

public class Switch_case2 {
	public static void main(String[] args) {
		String day = "Monday";
		switch (day) {
		case "Sunday":
			System.out.println("1st day of the week");
			break;
		case "Monday":
			System.out.println("2nd day of the week");
			break;
		case "Tuesday":
			System.out.println("3rd day of the week");
			break;
		case "Wednesday":
			System.out.println("4th day of the week");
			break;
		case "Thursday":
			System.out.println("5th day of the week");
			break;
		case "Friday":
			System.out.println("6th day of the week");
			break;
		case "Saturday":
			System.out.println("Last day of the week");
			default :
				System.out.println("this is not day of the week");
		}
	}

}
