package com.Java.Class13;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		String str="asafdsgTRETYY13425@%$#^^&$&";
		System.out.println(str.replaceAll("[0-9]", "@"));//replace all numbers from 0 to 9 with @
		System.out.println(str.replaceAll("[0-9]", ""));//remove all numbers
		System.out.println(str.replaceAll("[a-z]", ""));//remove all letters from a to z refer the ascii table for range info
		System.out.println(str.replaceAll("[sf]", ""));
		System.out.println(str.replaceAll("[a-k]", ""));
		System.out.println(str.replaceAll("[A-z]", ""));
		System.out.println(str.replaceAll("[^A-Z]", ""));//
		System.out.println(str.replaceAll("[^a-ZA-Z0-9]", ""));//remove all letters other than all letters from a to z,A to Z, numbers from 0 to 9
	}

}
