package com.Java.Class12;

public class IgnoreCaseDemo {

	public static void main(String[] args) {
		
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		
		if(str.equals("shah")) { //if we use == instead .equals we could have icorrect output(Java does not complain!!)
			//because sometimes ID of Strings are the same, sometimes are different
			
			System.out.println("I found it");
			
		}

		if(str.equalsIgnoreCase("shah")) { 
			
			System.out.println("I found it with equalsIgnoreCase");
		
		}
		//equals checks if two Strings are exactly the same with exact same case
		//equalsIgnoreCase checks if two Strings are exactly the same but does not care about the case of letters
		
		
		
		
		
		
		
		
		
		
		
	}

}
