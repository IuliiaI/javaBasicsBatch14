package com.Java.class3;

public class HWDoubleComparison {

	public static void main(String[] args) {
		
		double number1=56.67;
		double number2=35.27;
		
		if(number1>number2)
		{
			System.out.println("Double value "+number1+" is larger than "+number2);
		}
		else
		{
			System.out.println("Double value "+number1+" is less than "+number2);
		}

		number1=35.27;
		number2=56.67;
		
		if(number1>number2) 
		{
			System.out.println("Double value "+number1+" is larger than "+number2);
		}
		else 
		{
			System.out.println("Double value "+number1+" is less than "+number2);
		}
	}

}
