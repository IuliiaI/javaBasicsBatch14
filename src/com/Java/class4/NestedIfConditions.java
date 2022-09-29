package com.Java.class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		int time=9;
		String day="Monday";
		/*
		 * it is called outer if condition, if it is true then only inner conditions will be checked
		 * if it is false nothing from inner if condition will be executed, it is like main door
		 * if main door is closed we cant enter the building
		 */
		//outer if condition
		if(day.equals("Monday")) {//as String is a non primitive we cant use ==sign,we have to use .equals
			
			
			//inner if conditions
			if(time>7) {
				System.out.println("Lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}

	}

}
