package com.Java.Class10;

public class TeamProject1Task10 {

	public static void main(String[] args) {
		//Write a Java Program to find the second largest number in the array
		
		int[] numbers= {79, 333, 57, 785, 13};
		int largestNumber=numbers[0];
		int secondLargestNumber=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>largestNumber) {
				secondLargestNumber=largestNumber;
				largestNumber=numbers[i];
			}else if(numbers[i]<largestNumber && numbers[i]>secondLargestNumber) {
				secondLargestNumber=numbers[i];
			}
		}
        System.out.println(secondLargestNumber+" is second largest number in the array");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
