package com.Java.class3;

import javax.swing.Box;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting => type = data type casting= converting
		 * converting one data type to another
		 */
		
		byte box1=127; //smallest box
		short box2=3333; //slightly large box,  the size of box1 in terms of bits 16 bits
		int box3=45454545; // large box most commonly used, 32 bits
		long box4=45454545; // slightly large box, 64 bits
		float box5=414564545; // larger box
		double box6=454545445; //largerst
		
         int number=(int)15.2; //we cant store the decimal number in a box of type int
         System.out.println(number);
         
         //byte smallerBox=(byte)box2;
         long smallerBox=(long)box2;
         System.out.println(smallerBox);
         
         short biggerBox=box1;
         long box7=box1; //we can do this because box7 is larger than box1
         float box8=(float)box6;      //as box6 is larger it is double we need type casting to assign a value
         
         char a=(char)67;
         System.out.println(a);
         
         int box9=(int)box4;
         System.out.println(box9);
         
         
         
         
         
	}

}
