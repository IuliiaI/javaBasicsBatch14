package TeamProject1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1ArrayScanner {

	public static void main(String[] args) {
		//1. Using Scanner create an array of integer values. After
		//the array is created, fill the array with numbers, ask the numbers from the user
		//through console with the help of user
		//calculate the sum of all stored
		//elements in that array. (ask the user about the size of the array)
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size=scanner.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size; i++) {
			System.out.println("please enter an int number");
			arr[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		
		System.out.println("Sum of all numbers from the Array is "+sum);
		
		
		
		
		
		
	}

}
