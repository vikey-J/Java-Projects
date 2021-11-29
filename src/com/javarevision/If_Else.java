package com.javarevision;

public class If_Else {
	public static void main(String[] args) {
		int mark=46;
		if(mark>80&&mark<=100)
		{
			System.out.println("first calss");
			
		}
		else if(mark>=60&&mark<=80) 
		{
			System.out.println("average");
		}
		else if(mark>35&&mark<60)
		{
			System.out.println("not bad");
		}
		else
		{
			System.out.println("fail");
		}

}
}
