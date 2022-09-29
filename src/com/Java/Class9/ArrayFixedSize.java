package com.Java.Class9;

public class ArrayFixedSize {

	public static void main(String[] args) {
		
		int[] nums=new int[3];
		
		nums[1]=12;
		nums[2]=13;
		
		System.out.println(nums[0]); //wasted place in container, compiler does not complains
		
		
		String [] colors=new String[3];
		
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		colors[3]="Yellow"; 
		
		        // compiler complains here when we try to store extra element-java.lang.ArrayIndexOutOfBoundsException: 
		        //Index 3 out of bounds for length 3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
