package com.Java.class4;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		/*
		 * Just using to confuse Asma
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name");
		//takes a String type input from the keyboard and stores it in name variable
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		//takes an int from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		 System.out.println("hi "+name+" you are "+age+" years old"); 
		
		
		
		
		
		
	}

}
