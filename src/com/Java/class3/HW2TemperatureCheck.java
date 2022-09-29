package com.Java.class3;

public class HW2TemperatureCheck {

	public static void main(String[] args) {
    
		double temp;
		temp=35;
		
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will not freeze with temperature "+temp);
		}

		temp=45;
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will not freeze with temperature "+temp);
		}
		
	}

}
