package com.Java.Class11;

public class HWPhone {
	String make;
	String model;
	int storage;
	String color;
	String size;
	String operatingSystem;
	double weight;
	void call() {
		System.out.println(make+" is available for 5G connectivity calls");
	}
	void work() {
			System.out.println(make+" "+model +" works on " +operatingSystem);
		}
	public static void main(String[] args) {
		HWPhone Iphone=new HWPhone();
		Iphone.make="Apple Iphone";
		Iphone.model="13";
		Iphone.storage=512;
		Iphone.operatingSystem="IOS";
		Iphone.weight=6.14;
		Iphone.call();
		
		HWPhone Pixel=new HWPhone();
		Pixel.make="Google Pixel";
		Pixel.model="6";
		Pixel.storage=128;
		Pixel.operatingSystem="Android";
		Pixel.weight=7.3;
		Pixel.work ();
		
		HWPhone Samsungphone=new HWPhone();
		Samsungphone.make="Samsung";
		Samsungphone.model="20 S";
		Samsungphone.storage=128;
		Samsungphone.operatingSystem="Android";
		Samsungphone.weight=5.75;
		Samsungphone.work ();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
