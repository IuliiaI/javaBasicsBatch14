package com.Java.class5;

public class Task2 {

	public static void main(String[] args) {
		
		int day;
		day=8;
		
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		

	}

}
