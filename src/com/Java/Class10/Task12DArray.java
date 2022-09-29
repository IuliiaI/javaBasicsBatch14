package com.Java.Class10;

public class Task12DArray {

	public static void main(String[] args) {
		
		
		
		String[][] names=new String[2][4];
		
		names[0][0]="Mr";
		names[0][1]="Mrs";
		names[0][2]="Ms";
		names[0][3]="Miss";
		
		names[1][0]="Smith";
		names[1][1]="Jordan";
		names[1][2]="Jackson";
		names[1][3]="Obama";
		
		System.out.println(names[0][1]+" "+ names[1][0]+" , "+names[0][0]+" "+names[1][3]+" , "+names[0][2]+" "+names[1][2]+" , "+names[0][3]+" "+names[1][1]);
		
		
	}

}
