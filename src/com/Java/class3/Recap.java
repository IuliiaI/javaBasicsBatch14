package com.Java.class3;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String concetination helps us combine a String with any primitive data type together
		 * we can 
		 */
		
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+" **** "+lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="NewYork";
		String country="USA";
		String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNo+city;
		String step1="if we subtract 10 from 5 we get ="+10;//results in a String
		System.out.println(step1);
		
		//its is not defined Java does not understand what to do when we ask her to substract
		//a String from the number it complains
		//String step2=step1-5;
		
		
		System.out.println("if we subtract 10 from 5 we get =" +(10-5));
		
		
		
		

	}

}
