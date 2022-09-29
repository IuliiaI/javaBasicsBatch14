package com.Java.Class11;
public class HWDog {
	String name;
	String breed;
	String color;
	String temperament;
	double weight;
	double age;
	String placeOfBirth;
	boolean internationalPassport;
	boolean allVaccines;
	void travel (){
		if(internationalPassport==true && allVaccines==true) {
			System.out.println(breed+" "+name+" is able to travel abroad");
		}else {
			System.out.println(breed+" "+name+" is prohibited to international trips");
		}
	}
	void eat () {
			if(age>0 && age<0.9) {
				System.out.println("Puppies are eating 3-7 times per day");
			}else {
				System.out.println("Adult dog is eating 2 times per day");
			}
	}
	public static void main(String[] args) {
		HWDog dog1=new HWDog();
		dog1.name="Prince";
		dog1.breed="Husky";
		dog1.temperament="friendly";
		dog1.age=0.7;
		dog1.internationalPassport=false;
		dog1.allVaccines=true;
		System.out.println(dog1.breed+" has "+dog1.temperament +" temperament");
		
		HWDog dog2=new HWDog();
		dog2.name="Todd";
		dog2.breed="Bulldog";
		dog2.temperament="bullheaded";
		dog2.age=6.6;
		dog2.internationalPassport=true;
		dog2.allVaccines=true;
		
		dog2.eat();
		
		HWDog dog3=new HWDog();
		dog3.name="Linda";
		dog3.breed="Labrador";
		dog3.temperament="agile";
		dog3.age=1.6;
		dog3.internationalPassport=true;
		dog3.allVaccines=false;
		
		dog3.travel();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
