package com.Java.Class6;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);//false
		
		boolean bool=!false;
		System.out.println(bool);//true
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("I will go for a walk");
		}
		
		
		String day="Monday";
		
		if(!day.equals("Sunday")) {
			System.out.println("Today is not Sunday");
		}
				
		System.out.println(" -------------------------  ");
		
		boolean checkboxSelected=false;
		
		if(!checkboxSelected) {
			System.out.println("I will click and select it");
		}
		
		int num=10;
		if(!(num==10)) {
			
		}
		
		System.out.println("End of the program");

	}

}
