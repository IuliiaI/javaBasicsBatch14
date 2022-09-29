package TeamProject1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2ArrayScanner {

	public static void main(String[] args) {
		// Using Scanner create an array of countries and capitals. When the array is created,
		//then ask user to store countries and capitals in those arrays
		//then retrieve all values and while retrieving those values, 
		//print countries and capitals for each country together (use 2 different loops)
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many countries you want to store");
		int size=scanner.nextInt();
		
		String[] countries=new String[size];
		String[] capitals=new String[size];
		scanner.nextLine();
		 for(int i=0; i<size; i++) {
			 System.out.println("please enter the country name");
			 countries[i]=scanner.nextLine();
			 
			 System.out.println("Please enter the capital for "+ countries[i]);
			 capitals[i]=scanner.nextLine();
		 }
		
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
		
		for(int i=0;i<size;i++) {
			System.out.println("The country "+countries[i]+ " Has the capital "+capitals[i]);
		}
		
		
		
		
		
		
		
		

	}

}
