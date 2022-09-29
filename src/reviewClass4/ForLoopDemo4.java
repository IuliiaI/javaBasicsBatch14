package reviewClass4;

import java.util.Scanner;

public class ForLoopDemo4 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int i=scanner.nextInt();
		
		while(i!=10) {
			System.out.println(i);
			i=scanner.nextInt();
		}
      
		// all the loops are interchangeable but sometimes using the on type of loop
		// can make your code cleaner and easier to understand
		for (int k=0; i!=10; k++) {
			System.out.println(i);
			i=scanner.nextInt();
		}

		
		
		
		
		
	}

}
