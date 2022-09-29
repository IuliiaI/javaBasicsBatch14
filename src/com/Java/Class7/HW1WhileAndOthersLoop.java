package com.Java.Class7;

import java.util.Scanner;

public class HW1WhileAndOthersLoop {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("          Task 4    Way1     ");
		//Print odd numbers between 20 and 50 (2 ways)
		
		for(int a=20; a<=50; a++) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
		}
		System.out.println(" ");
		System.out.println("          Task 4    Way2    ");
		
		for(int b=21; b<=50; b+=2) {
		        System.out.print(b+" ");
			}
		
		System.out.println(" ");
		System.out.println("          Task 5         ");
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
		
		
		for (int nameNumber=1; nameNumber<=3; nameNumber++) {
			
		
		System.out.println("Please enter your name");
		String name=scanner.nextLine();
		
		System.out.println("Good afternoon "+name);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
