package com.Java.class4;

import java.util.Scanner;

public class HWInputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a credit card or not please enter true or false");
		boolean userHasACreditCard=scanner.nextBoolean();
		
		if(userHasACreditCard) {
			System.out.println("Please enter the balance on the card");
			int balance=scanner.nextInt();
			
			if(balance>1000) {
				System.out.println("You have to pay off immediately");
			}else {
				System.out.println("you can spend more");
			}
			
			
		}
		else {
			System.out.println("We offer you to issue a credit card");
		}
		
		

	}

}
