package com.Java.class5;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * to format code use
		 * mac: cmnd+shift+F
		 * Windows: cntrl+shift+F
		 * 
		 * 
		 */
		
		boolean allergy=true;
		
		String allergyType="pollen";
		
		if(allergy) {
			System.out.println("Lets check what allergy you have");
			
			if(allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoors");
			}else if(allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			}else if(allergyType.equals("Dairy")) {
				System.out.println("Please stay away from dairy products");
			}else {
				System.out.println("We need to do some test");
			}
			
		}else {
			System.out.println("You are lucky");
			
		}

		
		
	}

}
