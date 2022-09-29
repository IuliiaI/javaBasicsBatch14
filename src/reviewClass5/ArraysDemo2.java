package reviewClass5;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		String [] dresses=new String[] {"Pink Dress","cocktail", "Summer dress","Night dress", "forPencil Dress"};
		System.out.println(dresses.length);
		//last index is always size-1 because arrays start from zero
		
		for(int i=0; i<dresses.length;i++ ) {
			System.out.println("Lets try "+ dresses[i]);
		}
		
		for(String dress:dresses) {
			System.out.println("Lets try "+dress);
		}
		
		System.out.println(Arrays.toString(dresses));// to print all elements of an array without a loop
		
		
		
		
		
		
		
	}

}
