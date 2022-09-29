package com.Java.Class12;

public class PhoneTester {

	public static void main(String[] args) {
		/*
		 * if class whos object we are creating
		 * is present inside the same package
		 * we dont need to import it.
		 */
		
		
		Phone Iphone=new Phone();
		Iphone.make="Apple Iphone";
		Iphone.model="13";
		Iphone.storage=512;
		Iphone.operatingSystem="IOS";
		Iphone.weight=6.14;
		Iphone.call();
		
		Phone Pixel=new Phone();
		Pixel.make="Google Pixel";
		Pixel.model="6";
		Pixel.storage=128;
		Pixel.operatingSystem="Android";
		Pixel.weight=7.3;
		Pixel.work ();
		
		Phone Samsungphone=new Phone();
		Samsungphone.make="Samsung";
		Samsungphone.model="20 S";
		Samsungphone.storage=128;
		Samsungphone.operatingSystem="Android";
		Samsungphone.weight=5.75;
		Samsungphone.work ();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
