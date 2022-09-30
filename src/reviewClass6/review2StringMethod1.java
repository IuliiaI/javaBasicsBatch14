package reviewClass6;

public class review2StringMethod1 {

	public static void main(String[] args) {
		
		// trim() ->
		String textFromApplication="  Enroll today  ";
		String textFromUserStory="Enroll today";
		
		if(textFromApplication.trim().equals(textFromUserStory)) {
			System.out.println("Text is matched.Test Pass");
		}else {
			System.out.println("Text is not matched.Test Failed");
		}
        
		System.out.println(textFromApplication.trim());
		System.out.println(textFromApplication);
		
		//substring() Returns a string that is a substring of this string. 
		
		String str="Hello Class";
		String part2=str.substring(6);//Class
		System.out.println(part2);
		
		String part1=str.substring(0, 5);//Hello
		System.out.println(part1);
		
		//concat
		String newString=part1.concat(" ").concat(part2);
		System.out.println(newString);
		
		System.out.println(part1+part2);
		
		//some examples
		
		char single=newString.substring(6).charAt(0);
		System.out.println(single);
		
		//newString.charAt(0).substring(6); compiler error as we cant use substring (String method) with char 
		
		//replace(); 
		String myString="Today is September";
		myString=myString.replace("September", "October");// we have to reassign String myString to have changes in the output
		
		System.out.println(myString);
		
		myString=myString.replace('A', 'w');//we will have exactly the same String as it does not replaces if dont find
		
		//myString.equalsIgnoreCase("Today is october).replace('a','i'); error because equalsIgnoreCase returns boolean value
		
		//split(); ->it cuts our String
		
		String myStr="Today is a review class";
		
		String[] array=myStr.split(" ");
		System.out.println(array.length);// 5 -> in length we dont have parantathies () in Array 
		
		System.out.println(array[3]);//review as output
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(String arr:array) {
			System.out.println(arr);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
