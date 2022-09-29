package com.Java.Class6;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		//matching cases must of same data type as a variable
		// no duplicated cases in switch
		//Y y
        char choice='Y';
        String answer;
        
        switch(choice) {
        
        case 'Y':
        	answer="Yes";
        	break;
        case 'N':
        	answer="No";
        	break;
        case 'M':
        	answer="Maybe";
        	break;
        default:
        		answer="Unknown";
        		break;
        	
        }
        
		System.out.println(answer);
		
		//Limitations of Switch
		//cannot use logical operators
		//cannot use relational operators
		
		/*
		 * CANNOT work with boolean values
		 * 
		 * cANNOT work with float/double and long
		 * 
		 */
		
		
		
		
	}

}
