package com.Java.Class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		
		String[][] countries= {
				
				{"usa", "Canada"},//1 array with index 0
				{"Peru", "Brazil", "Colombia", "Ecuador"},//2 array has index 1
				{"Ethiopia", "Egypt", "Kenya"},
				{"Germany", "Turkiye", "Moldova", "Ukraine"},
				{"Kazakhstan", "Afghanistan", "Korea"}
				
				
		};
		
		for(String[] country:countries) {
			for(String c:country) {
				
				if(c.equals("Kazakhstan")) {
					System.out.println(c+ " is my home country");
				}else {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(countries.length); //5 is telling how many countries in 2D arrays- number of raws;
		// total number of arrays or rows
		
		int elOf1arr=countries[0].length;
		System.out.println("# of elements from 1 array = "+elOf1arr);
		
		int elOf2arr=countries[1].length;
		System.out.println("# of elements from 2 array = "+elOf2arr);
		
		System.out.println("-----------------getting all values from 2d arrays -----------");
		
		for(int r=0; r<countries.length; r++) { //loops over rows
			for(int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+" ");
			}
			System.out.println();
		}
		
		 
		
		}
		

	}

	}
