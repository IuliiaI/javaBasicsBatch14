package com.Java.Class12;

public class StringDemo7 {

	public static void main(String[] args) {
		
		String str="Batch 14 is good 15565778##%@ ASGFFHGKJHL bnbbmetrete";
		
		/*
		 * replace replaces one String with another in a String
		 * replaceAll it takes a pattern and replace all the characters that follow that pattern
		 */
		System.out.println(str.replace("good", "excellent"));
        System.out.println(str.replaceAll("[a-z]", "#"));
        
        
        
	}

}
