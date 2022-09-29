package com.Java.Class6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		/*
		 * we need to ask the user where he/she is from
		 * based on the country ->define favourite food
		 */
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please tell me where are you from");
		
		String country=in.nextLine();
		String favouriteFood;
		
		switch(country) {
		     
		case "usa":
			favouriteFood="burgers and fries";
		    break;
		case "Kazakhstan":
			favouriteFood="beshparmak";
			break;
		case "Turkey":
			favouriteFood="adana kebab";
			break;
		case "Venezuela":
			favouriteFood="Arepa";
			break;
		case "India":
			favouriteFood="chicken curry";
			break;
		case "Yemen":
			favouriteFood="Mandi";
			break;
		case "Afganistan":
			favouriteFood="Qaboli Palow";
			break;
			default:
				favouriteFood="Unknown";
				break;
				
		}
		
		System.out.println("You are from " +country+" and your favourite food is "+favouriteFood);
		
	}

	}


