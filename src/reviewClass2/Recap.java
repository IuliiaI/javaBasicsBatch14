package reviewClass2;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explicit
        // As we cant fit 129 in byte we will get wrong results
		short largerBox=129;
		byte smallerBox=(byte)largerBox;
		System.out.println(smallerBox);
		
		//Explicit
		//As we can fit 129 in short we will get proper results
		int largerBox1=129;
		short smallerBox2=(short)largerBox1;
		System.out.println(smallerBox2);
		
		//Implicit
		short smallerBox3=45;
		long largerBox3=smallerBox3;
		System.out.println(largerBox3);
		
	}

}