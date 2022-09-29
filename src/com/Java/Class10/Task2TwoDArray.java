package com.Java.Class10;

public class Task2TwoDArray {

	public static void main(String[] args) {
		
		String[][] grades= {
				{"Faiza", "Anton", "Mina", "Iuliia"},
				{"A","B","C","D"}
		};
		System.out.println(grades[0][0]+"="+grades[1][0]);
		
		
		for(String[] singleArray:grades) { //loops over 1d or single array
			for(String el:singleArray) { //loops over each element of the 1d array
				System.out.print(el+" ");
			}
		}
		
		
		System.out.println(" ------------------------  ");
		for(int r=0; r<grades.length; r++) {
			for(int c=0; c<grades[r].length; c++) {
				System.out.print(grades[r][c]+" ");
			}
		}
		

	}

}
