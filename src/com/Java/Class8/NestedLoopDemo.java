package com.Java.Class8;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		for(int i=1; i<3; i++) {  //--> outer loop controls inner loop
			System.out.println("Hello");
			
		    for(int j=1; j<=3; j++) {
			    System.out.println("Bye"); //--> inner loop depends on outer loop
		    }
		
		}
		
		System.out.println("-----------------------------");
		
        for(int i=0; i<=2; i++) {
        	for(int j=1; j<4; j++) {
        		
        		System.out.println(i+" "+j);
        	}
        }
		
		System.out.println("-----------------------------");
		
		
		
		
		
		
	}

}
