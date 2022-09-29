package com.Java.class4;

import java.util.Scanner;

public class HWInputFromKeyboard1 {

	public static void main(String[] args) {
		
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("What is the amount of loan is needed? ");
    int loan=scanner.nextInt();
    
    if(loan<=200000) {
    	System.out.println("Bank lends the money");
    } else {
    	System.out.println("Bank rejects lending the money");
    }
    
    
    
    
    
    
	}

}
