package com.Java.Class12;

public class StringDemo {

	public static void main(String[] args) {
		
		String str=new String("Java");//proper way of creating an object
		
		String name="Asma Alfadhil The Great";//simpler and shorter way provided
		//by Java creators to make our life a little easier
		//only works for String and Wrapper classes
		
		
		//counts the number of characters in a string including the spaces
        System.out.println(str.length());
        
        System.out.println(name.length());
        if(name.length()>15) {
        	System.out.println("Name cant be more than 15 characters");
        }
	}

}
