package com.Java.Class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
        System.out.println("Please enter your quiz score");
        double quiz=scanner.nextDouble();

        System.out.println("Please enter your mid term score");
        double midTerm=scanner.nextDouble();

        System.out.println("Please enter your final score");
        double finalScore=scanner.nextDouble();
        
        double average;
        average=(quiz+midTerm+finalScore)/3;

        String grade;

        if(average>=90) {
            grade="A";
        }else if(average>=70 && average<90) {
            grade="B";
        }else if (average>=50 && average<70) {
            grade="C";
        }else if(average<50&&average>=0) {
            grade="F";
        }else {
            System.out.println("Wrong info is entered");
            grade="Invalid";
        }
        System.out.println(grade);
		
		
		
	}

}
