package com.Java.Class8;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int secretNumber=7;
		int number;
		
		// 1.from the range of 1 to 50
		//please find the sum off all even and all odd numbers
		
		int sumOdd=0;
		int sumEven=0;
		
		
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("Sum of odd numbers = " +sumOdd);
		System.out.println("Sum of even numbers = " +sumEven);
		
		
		
		System.out.println("-----------------------------");
		/*
		 * 2.create a secret number and let user guess the secret number
		 * once user guessed your secret number-->program says you won!
		 */
		
		do {
			System.out.println("Try to guess the secret number" );
			number=scanner.nextInt();
			
			if(number>secretNumber) {
				System.out.println("Try one more time");
			}else if(number<secretNumber) {
				System.out.println("Try one more time");
			}
		}while(number!=secretNumber);
		
		System.out.println("You won! Congrats!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
