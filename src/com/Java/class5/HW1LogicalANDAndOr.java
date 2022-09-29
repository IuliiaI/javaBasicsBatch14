package com.Java.class5;

import java.util.Scanner;

public class HW1LogicalANDAndOr {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please input your local current time using 24 hours format");
		
		double time=scanner.nextDouble();
		
		if(time>=1 && time<=11) {
			System.out.println("It is morning there");
		}else if(time>=12 && time<=15) {
			System.out.println("It is afternoon time there");
		}else if(time>=16 && time<=20) {
			System.out.println("It is evening time there");
		}else if(time>=21 && time<=24)  {
			System.out.println("It is night time there");
		}
		
		
		

	}   

}
