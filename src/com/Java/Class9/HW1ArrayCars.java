package com.Java.Class9;

public class HW1ArrayCars {

	public static void main(String[] args) {
		
		String[] cars={"Toyota", "Honda", "Ford", "Lexus","Volkswagen", "Jaguar"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
       System.out.println();
       
		for(String car : cars) {
			System.out.print(car+" ");
		}
		
		
		
	}

}
