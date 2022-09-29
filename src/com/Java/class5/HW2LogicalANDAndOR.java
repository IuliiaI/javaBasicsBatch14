package com.Java.class5;

import java.util.Scanner;

public class HW2LogicalANDAndOR {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Please enter your birth month");
		String month=scanner.nextLine();
		
		if(month.equals("December") || month.equals("January") || month.equals("February")){
			System.out.println("The season is winter");
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("The season is spring");
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("The season is summer");
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("The season is autumn");
		}
		
		
		
		
		
		
		
	}

}
