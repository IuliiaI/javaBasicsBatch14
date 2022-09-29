package com.Java.Class10;

import java.util.Scanner;

public class TeamProject1Task2 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When the array is created,
		//retrieve all values from it and while retrieving those values, 
		//print capital for each country (use 2 different loops
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the name of the country");
		
		
	    String[] countries= new String[5];
		
		for(int i=0; i<countries.length; i++) {
			countries[i]=scanner.nextLine();
			if(countries[i].equals("USA")) {
				System.out.println("The capital of "+countries[i]+" is Washington");
			}else if(countries[i].equals("Ukraine")) {
				System.out.println("The capital of "+countries[i]+" is Kyiv");
			}else if(countries[i].equals("France")) {
				System.out.println("The capital of "+countries[i]+" is Paris");	
			}else if(countries[i].equals("Turkiye")) {
				System.out.println("The capital of "+countries[i]+" is Ankara");		
			}else if(countries[i].equals("Egypt")) {
					System.out.println("The capital of "+countries[i]+" is Cairo");		
			}
			
		}
		
		for(String country:countries) {
			country=scanner.nextLine();
			if(country.equals("USA")) {
				System.out.println("The capital of "+country+" is Washington");
			}else if(country.equals("Ukraine")) {
				System.out.println("The capital of "+country+" is Kyiv");
			}else if(country.equals("France")) {
				System.out.println("The capital of "+country+" is Paris");	
			}else if(country.equals("Turkiye")) {
				System.out.println("The capital of "+country+" is Ankara");		
			}else if(country.equals("Egypt")) {
					System.out.println("The capital of "+country+" is Cairo");		
			}
		}
      
	}	
	
}


