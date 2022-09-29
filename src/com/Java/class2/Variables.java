package com.Java.class2;

public class Variables {

	public static void main(String[] args) {
		// assign and reassign variables
		
		String name="Juli";
		String last_name="Jaremko";
		String grade="MBA";
		String city="Kyiv";
		String country="Ukraine";
		String phone_number="096 71 528 71";
		
		System.out.println("My name is " + name + " and my last name is "+last_name);
		System.out.println("I am " + grade + " student ");
		System.out.println("I live in " + city + " and " + country);
		System.out.println("And my phone number is " + phone_number);
		
		//Changes
		city="New York";//reassigning
		country="USA";
		phone_number="347 939 44 74";
		grade="PHD";
		
		System.out.println("My name is " + name + " and I moved to "+city+ " and "+country +"."+" My new phone number is "
				+phone_number);
		
		//Rules for identifiers=names (variables, methods, classes...
		//1. cannot use keywords as identifiers
		//String new="Hello"; -> error
		
		//2. cannot have spaces in identifiers
		//String last name="Smith";
		
		//3. identifiers cannot start with numbers
		// int 1number=123;
		int number1=123; //number can be anywhere after 
		
		/*4. identifiers cannot contain any special characters
		 * boolean hello!=true;
		 * char #chara='A';
		 * except $ or_
		 */
		
		double $price=9.89;
		float _price1=1.99F;
		
		/*Naming Conventions
		 * 
		 *Class should start with uppercase and follow camel casing
		 *
		 * variables should start with lowercase and follow camel casing
		 * 
		 */
		
		String Weather="hot"; //not preferred
		
		String myWeather="cold"; //preferred
		
		
		
		
		
	}

}
