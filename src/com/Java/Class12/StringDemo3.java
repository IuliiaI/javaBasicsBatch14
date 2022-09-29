package com.Java.Class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str=" i love java ";
		System.out.println(str);
		System.out.println(str.trim());
		
		
		//it removes spaces before and after the String but not ones
		//which are present in between

		String str2="Java is Very easy";
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		
		/*
		 * Method changing helps us call multiple methods on a single line one method after an another
		 */
		System.out.println(str2.toLowerCase().contains("very"));
		
		/*
		 * startsWith->> checks if a String starts with a specific letter or word when it first time appears in the String!!!
		 * endsWith->> checks if a String ends with a specific letter or word
		 * contains->> checks if a String contains a specific letter or word
		 */
	}

}

