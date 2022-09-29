package com.Java.class4;

public class HWNestedConditions2 {

	public static void main(String[] args) {
		
		double mortageRate=3;
		double mortagePrice=150000;
		
		if(mortageRate<=4.5) {
			System.out.println("User will buy a house");
			if(mortagePrice>200000) {
				System.out.println("User will take a loan");
			}else {
				System.out.println("User will pay cash");
			}
			
			}
		else {
			System.out.println("User will not buy a house");
		
		}

	}

}
