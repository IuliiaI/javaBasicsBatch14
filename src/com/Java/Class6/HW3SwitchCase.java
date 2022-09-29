package com.Java.Class6;

import java.util.Scanner;

public class HW3SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers and operator(+,-,*,/)");
		
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		char operator=scanner.next().charAt(0);
		boolean wrongOperator=false;
		double operation;
		
		
		
		if(operator=='+') {
			operation=num1+num2;
		}else if(operator=='-') {
			operation=num1-num2;
		}else if(operator=='*') {
			operation=num1*num2;
		}else if(operator=='/') {
			operation=num1/num2;
		}else {
			System.out.println("enter valid operator");
			wrongOperator=true;
		}
		
		if (!wrongOperator) {
			System.out.println("operation");
		}
		
		System.out.println(" *******Switch case*******");
		
		
		
		switch(operator) {
		case '+':
			operation=num1+num2;
			break;
		case '-':
			operation=num1-num2;
			break;
		case '*':
			operation=num1*num2;
			break;
		case '/':
			operation=num1/num2;
			break;
			default:
				operation=num1%num2;
				break;
			
		}
		
		System.out.println(operation);
		
		
		
		
		
		
		
		
		

	}

}
