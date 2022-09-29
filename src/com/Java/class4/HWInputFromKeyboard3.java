package com.Java.class4;

import java.util.Scanner;

public class HWInputFromKeyboard3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String city=scanner.nextLine();
		
		System.out.println("Please enter the temperature in Fahrenheit");
		double temperatureFahrenheit=scanner.nextDouble();
		
		System.out.println("The temperature of the city "+city+" is "+(temperatureFahrenheit-32)/1.8);

	}

}
