package reviewclass1;

public class VariablesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Batch 14");
		/*
		 * if we want to store whole number we can use below data types
		 * without decimal part like 10,23,4000,10000000 but we cant use them to store decimal numbers like 12.3,1.5
		 * byte
		 * short
		 * ing
		 * long
		 * although above four data types can be used to store whole numbers but we will be using in most of the time
		 *  as it can handle up to billions and does not waste a lot of space from RAM(memory where computer stores the programs
		 *  which are opened and running currently)
		 */
int box1=12;
//char box1='5'; not allowed as it creates confusion
//int=> data type;
//box1=>variable name;
//=is called assignment operator and used to store data in variable
// 12 its the data that we want to store in box1
// ; language rule we need to end all the lines with semicolons
    int box2; //creating a box but not storing data right away in the box
    box2=20;
    
    box1=30; //i am replacing the value 12 stored in box1 30
    System.out.println(box1);
    System.out.println(box2);
    
    
	}

}
