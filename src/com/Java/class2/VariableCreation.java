package com.Java.class2;

public class VariableCreation {

	public static void main(String[] args) {
		// 1 way to create a variable
		byte b=10; //create a variable and assign value
		
		//2 way to create a variable
		int i; //create a variable
		i=100; //assign value
		
		//we need to create a variable only once
		//then we can use as many times we want/need do
		
		//3way 
		//create a variable or declare a variable
		int num1, num2, num3;
		
		num1=100; //assign value or initialize variable
		num2=200;
		num3=300;
		
		//int num1=100; error ->duplicate variable
		
		//?Can I change a value of a variable???
		num2=2000;//reassign the value
		
		System.out.println(num2);
		
		//1 variable can hold only 1 value at 1 time/per line 
		
		byte age=17;
		age=19;
		
		short year=1984;
		year=2000;
		
		int box=119999; 
		box=2987654;
		
		long bank_card=5168776986543167L; 
		bank_card=68234567897643L;
		
		float interest_rate=2.55F;
		interest_rate=6.77F;
		
		double variable=99.99; //popular
		variable=567.888;
		
		char letter1='S';
		letter1='G';
		
		char question_mark='?';
		question_mark='?';//how to change this ???
		char exclamation_mark='!';
		
		
		boolean nice=true;
		nice=false;
		
		boolean ugly=false;
		ugly=true;
		
		
		System.out.println(age);
		System.out.println(year);
		System.out.println(box);
		System.out.println(bank_card);
		System.out.println(interest_rate);
		System.out.println(variable);
		System.out.println(letter1);
		System.out.println(question_mark);
		System.out.println(nice);
		System.out.println(ugly);

		
		
		
		
		

	}

}
