package com.Java.Class9;

public class HW2ArrayAnimals {

	public static void main(String[] args) {
		
		String[] animals= {"Zebra", "Elephant", "Lion", "Tiger", "Rhinoceros"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
        System.out.println();
        
        for(String animal : animals) {
        	System.out.print(animal+" ");
        }
	}

}
