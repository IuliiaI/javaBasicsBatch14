package com.Java.class4;

import java.util.Scanner;

public class HWInputFromKeyboard2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age=scanner.nextInt();
		
		if(age>=18) {
			System.out.println("DMV will issue a driver licence to you");
		} else {
			System.out.println("We offer you to get a learners permit");
		}

	}

}
