package com.Java.Class7;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int  time=10;
		
		if(time<12) {
			System.out.println("good morning inside if statement");
		}
		
		/*
		 * infinite loop
		 * while (time<12) {
			System.out.println("good morning inside while loop");}
		 */
		while (time<12) {
			System.out.println("good morning inside while loop");
			time++; //10+1=11+1=12
		}

		
		
		
		
		
		
	}

}
