package com.Java.Class9;

public class HW4ArrayLargestNumber {

	public static void main(String[] args) {
		
		int[] numbers= new int[4];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		
		if(numbers[0]>numbers[1] && numbers[0]>numbers[2] && numbers[0]>numbers[3]) {
			System.out.println("The largest number is "+ numbers[0]);
		}else if 
		(numbers[1]>numbers[0] && numbers[1]>numbers[2] && numbers[1]>numbers[3]) {
			System.out.println("The largest number is "+ numbers[1]);
		}else if 
		(numbers[2]>numbers[0] && numbers[2]>numbers[1] && numbers[2]>numbers[3]) {
			System.out.println("The largest number is "+ numbers[2]);
		}else if 
		(numbers[3]>numbers[0] && numbers[3]>numbers[1] && numbers[3]>numbers[2]) {
			System.out.println("The largest number is "+ numbers[3]);
		}
		 
		System.out.println("********************************");
		
		int[] figures= {100, 4000, -50, 300, 200,90};
		
		int largestFigure=figures[0];//we assume that figure[0} is the largest number and starts for loop initialisatio
		// from int a=1 NOT int a=0!!!!
		
		for(int a=1; a<figures.length; a++) {
			if(figures[a]>largestFigure) {
				largestFigure=figures[a];
				
			}
		}
		System.out.println(largestFigure);
		
		System.out.println("Enhanced loop");
		
        int[] fig= {100, 4000, -50, 300, 200,90};
		
		int largestFig=fig[0];
		
		for(int f:fig) {
			if(f>largestFig) {
				largestFig=f;
				
			}
		}
		System.out.println(largestFig);
		

	}

}
