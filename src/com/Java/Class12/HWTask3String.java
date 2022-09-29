package com.Java.Class12;

import java.util.Scanner;

public class HWTask3String {

	public static void main(String[] args) {
		/* 
		 * Write a program that reads two people's first names and if they expecting boy or girl? 
		 * Based on the input suggests a name for a baby:
		 * Example Output:
		 * Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: DANRY
		 * Example Output:
		 * Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? girl
		 * Suggested baby name: MAIEL
		 */ 
        String nameMom;
        String nameDad;
        String gender;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter the name of Mom");
		nameMom=scanner.next();
		System.out.println("please enter the name of Dad");
		nameDad=scanner.next();
		System.out.println("please enter who are you expecting, boy or girl");
		gender=scanner.next();
		
		if(gender.equals("boy")) {
			System.out.println(nameDad.substring(0,(nameDad.length()/2))+nameMom.substring(nameMom.length()/2));
		} else if(gender.equals("girl")){
			System.out.println(nameMom.substring(0,(nameMom.length()/2))+nameDad.substring(nameDad.length()/2));
		}
		
		
		
		
		
	}

}
