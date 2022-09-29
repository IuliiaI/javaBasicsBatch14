package com.Java.Class8;

import java.util.Scanner;

public class Task3DoWhile {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy and the price of that item.
		// Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		// If user give more money program should return a change. 
		//Whenever user done with payments program should say "Thank you for shopping!"
		
		Scanner scanner=new Scanner(System.in);
		
		String item;
		int priceOfItem;
		
		System.out.println("Please enter the item you want");
		item=scanner.nextLine();
		System.out.println("Please enter the price of the item");
		priceOfItem=scanner.nextInt();
		
		int amountGiven;
		int total = 0;
		
		do {
			System.out.println("Plese enter amount of money you have");
			amountGiven=scanner.nextInt();
			
			total+=amountGiven; //accumulate all money
			int need;
			int change;
			
			if(total<priceOfItem) {
				need=priceOfItem-total;
				System.out.println ("You need to pay more $ "+ need);
				
			}else if(total>priceOfItem) {
				change=total-priceOfItem;
				System.out.println(change +" is your change");
				break;
			}
		}while(total!=priceOfItem);
		
		System.out.println("Thank you for shopping");

	}

}
