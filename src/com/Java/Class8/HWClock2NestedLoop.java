package com.Java.Class8;

public class HWClock2NestedLoop {

	public static void main(String[] args) {

        for(int a=0; a<=2; a++) {
        	
        	for(int b=0; b<=9; b++) {
        		
        		if(a==2) { // if(a==2 && b==4) { break; } also can be used !!!
        		
        		if(b==4) {
        			break;
        		}
        		}
        	
        	    for(int c=0; c<=5; c++) {
        			for(int d=0; d<=9; d++) {
        				System.out.println(a+""+b+":"+c+""+d);
        			}
        		}
        	}
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
