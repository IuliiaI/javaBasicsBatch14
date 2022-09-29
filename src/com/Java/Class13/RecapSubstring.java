package com.Java.Class13;

import java.util.Arrays;

public class RecapSubstring {

	public static void main(String[] args) {
		
		String str="today is Sunday";
		String day=str.substring(9);
		
		System.out.println(day);
		System.out.println(str.substring(6,8));
		
		//System.out.println(str.charAt(4));
		
        char c=str.charAt(4);//calling the method charAt on str object
        
        char[] charArr=str.toCharArray();
        //System.out.println(charArr);//it will print like String again
        System.out.println(Arrays.toString(charArr));//we use to print array like array are built
        
       int index=str.indexOf("a");
       System.out.println(index);
       System.out.println(str.indexOf("a",6));//we can choose "a" beginning from "6" index - second "a"
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
