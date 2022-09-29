package com.Java.Class6;

import java.util.Scanner;

public class HW2SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your grade from A to D");
		
		char grade=scanner.next().charAt(0);
		String explanation;
		
		switch(grade) {
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
			default:
				explanation="Non acceptable";
				break;
	
		}
		System.out.println("Your grade is "+grade+" and it is "+explanation);

	}

}
