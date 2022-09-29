package com.Java.Class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName);
        
		System.out.println(firstName.concat(" ").concat(lastName));
		
		String str=" "; //if we put a space it will not be empty
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank());//this method ignores spaces
		
		/*
		 * isEmpty() returns true if a String is empty this method will return false even if you have
		 * a space in a String variable however the isBlank method does not count the spaces
		 * BUT isBlank method does not work in Java 8, only in Java 11 or Intellij
		 */
		
		
	}

}
