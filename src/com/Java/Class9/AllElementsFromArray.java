package com.Java.Class9;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] iceCream= {"vanilla", "chocolate","pistashio","kulfi","mango"};
		
		//System.out.println(iceCream[0]);
		//System.out.println(iceCream[1]);
		
		//how to get all values?
		
	    for(int i=0; i<iceCream.length;i++) { // with arrays we do not use i<=iceCream.length -->error
	    	System.out.println(iceCream[i]);
	    }
		
		char [] letters= {'A','B','C','D','F'};
		
		for(int i=0; i<letters.length; i++) {
			System.out.print(letters[i]+" ");
		}
		
		
		
		
		
		

	}

}
