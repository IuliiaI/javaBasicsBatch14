package com.Java.Class12;

public class StringDemo6 {

	public static void main(String[] args) {
		
		String str="I am always confused i was kidding";
		
		System.out.println(str.indexOf("a"));//checks only first location
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		System.out.println(str.substring(5));//we can have smaller String which starts from the index we assign in command
		
		System.out.println(str.substring(5,11));
		
		
		//substring part for integer ->>
		int num=121232323;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		num=Integer.parseInt(numStr);
		System.out.println(num);
		
	}

}
