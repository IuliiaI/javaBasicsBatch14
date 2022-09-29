package com.Java.Class6;

import java.util.Scanner;

public class HW1SwitchCase {

	public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Please tell me where are you from");
	
	String country=scanner.nextLine();
	String language;
	
	switch(country) {
	case "USA":
		language="English and Spanish";
		break;
	case "Ukraine":
		language="Ukrainian";
		break;	
	case "Spain":
		language="Spanish";
		break;
	case "Great Britain":
		language="English";
		break;
	case "France":
		language="French";
		break;
	case "Germany":
		language="Deutsch";
		break;
	case "Switzerland":
		language="Swiss";
		break;
	default:
			language="Unknown";
			break;
	}
	System.out.println("You are from "+ country+" and you speak "+language);
	


	}

}
