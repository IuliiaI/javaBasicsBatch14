package com.Java.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean understandJava=true;
		boolean enjoyJava=true;
		boolean practice=true;
		
		if(understandJava && enjoyJava && practice) {
			System.out.println("This is awersome");
		}
		
		System.out.println("   another example   ");
		
		//find the largerst number and then
		//find if the largerst number is even or odd
		
		int n1=10; //100
		int n2=10; //100
		int n3=10; //100 and int largest; then error:variable largest can not be initialized
		
		int largest = 0;
		
		if(n1>n2 && n1>n3) {
			largest = n1;
			
		}else if (n2>n1 && n2>n3) {
			largest = n2;
			
		}else if(n3>n1 && n3>n2) {
			largest=n3;
		} else {
			System.out.println("Numbers are equal");
		}
        
		
		if(largest!=0) {
		
		    if(largest%2==0) {
			System.out.println(largest+" is even number");
		    }else {
			System.out.println(largest+" is odd number");
		}
		
		}
	}

}
