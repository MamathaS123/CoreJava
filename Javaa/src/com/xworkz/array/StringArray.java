package com.xworkz.array;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[]= {"Rajajinagar","Basaveswarnagar","Vijaynagar","Malleshwaram"};
		String city="Basaveswarnagar";
		for(int i=0;i<4;i++) {
			if(cities[i]==city) {
				System.out.println("city is present in array");
			}
			else { 
				System.out.println("city is not present in an array");
			}
		}
		
	}

}
