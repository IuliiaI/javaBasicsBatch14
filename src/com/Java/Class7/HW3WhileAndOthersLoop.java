package com.Java.Class7;

import java.util.Scanner;

public class HW3WhileAndOthersLoop {
	
	public static void main(String[] args) {
		System.out.println("          Task 6    ");
		
		//Declare a variable to store a price for a coffee. Ask the user to pay for a coffee.
		//Keep asking to pay for coffee until the user enters the EXACT amount . 
		//If the user gives more than coffee price --> ask them to give less,
		//if the user gives less money then ask to give more. 
		//Once user give EXACT amount print “Please enjoy your coffee
		
		double priceOfCoffe=5.0;
		Scanner scanner=new Scanner(System.in);
		double amount;
		
		do {
			System.out.println("Please pay for a coffe");
			amount=scanner.nextDouble();
		
			if(amount>priceOfCoffe) {
				System.out.println("Please give less");
			}else if(amount<priceOfCoffe) {
				System.out.println("Please give more");
			}
		
		}while (amount!=priceOfCoffe);
		    
		System.out.println("Please enjoy your coffee");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
