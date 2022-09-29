package com.Java.class4;

import java.util.Scanner;

public class HWInputFromKeyboard5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter a number of worked years");
		int numberOfWorkedYears=scanner.nextInt();
		
		if(numberOfWorkedYears>=5) {
			System.out.println("You are eligible to the bonus");
			
			System.out.println("Please enter number of your annual salary");
			int salary=scanner.nextInt();
			
			if(salary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		
		
		
		}else {
			System.out.println("You are not eligible to the bonus");
		}
		

	}

}
