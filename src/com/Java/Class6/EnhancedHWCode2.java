package com.Java.Class6;

import java.util.Scanner;

public class EnhancedHWCode2 {

	public static void main(String[] args) {
	
			
			Scanner scanner=new Scanner(System.in);

			System.out.println("Please enter your birth month");
			String month=scanner.nextLine();
			
			String season;
			
			if(month.equals("December") || month.equals("January") || month.equals("February")){
				season="winter";
			}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
				season="spring";
			}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
				season="summer";
			}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
				season="autumn";
				
			}else {
				System.out.println("You entered invalid month");
				season="invalid";
			}
			
			if(!season.equals("invalid")) {
				System.out.println("you were born in "+season);
			}
			
			

	}

}
