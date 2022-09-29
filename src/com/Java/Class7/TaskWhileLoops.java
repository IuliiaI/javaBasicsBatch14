package com.Java.Class7;

public class TaskWhileLoops {

	public static void main(String[] args) {
		//print numbers from 100 to 1
		System.out.println("    Task1   ");
		
		int a=100;
		
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}
		// print even numbers from 20 to 100 
		System.out.println("   Task2   ");
		
		int b=20;
		
		while (b<=100) {
			if(b%2==0) {
			System.out.print(b+" ");
		}
			b++;
		}
		
		int c=20;
		
		while(c<=100) {
			System.out.println(c+" ");
			c+=2;
		}
		// print only odd numbers from 100 to 1
		System.out.println("    Task3   ");
		
		int d=100;
		
		while(d>=1) {
			if(d%2!=0) {
				System.out.println(d+" ");
			}
			d--;
		}
		
		int e=99;
		
		while(e>=1) {
			System.out.println(e+" ");
			e+=2;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
