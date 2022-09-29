package com.Java.class4;

public class HWNestedIfConditions1 {

	public static void main(String[] args) {
		
		boolean userHasDiploma=true;
		double gpaScore=3;
		boolean userHasDegreeProgram=true;
		
		if(userHasDiploma=true) {
			System.out.println("Congratulations");
			
		    if(userHasDegreeProgram) {
		    	if(gpaScore>=3.5) {
		    		System.out.println("You are eligible for scholarship");
		    	} else {
		    		System.out.println("You should have studied harder");
		    	}
		    }
	}
		else {
			System.out.println("You should get a degree");
		}

	}

}
