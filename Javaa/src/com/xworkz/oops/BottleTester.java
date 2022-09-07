package com.xworkz.oops;

public class BottleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bottle b1 = new Bottle();
		System.out.println(b1.brand);
		b1.open();
		
		b1.brand="Milton";
		b1.capacity=1;
		b1.color="grey";
		b1.make="Steel";
		b1.price=1000;
		
		System.out.println("********************************");
		
		System.out.println(b1.brand);
		System.out.println(b1.capacity);
		System.out.println(b1.color);
		System.out.println(b1.make);
		System.out.println(b1.price);
		
		System.out.println("*********************************");
		
		Bottle b2 = new Bottle();
		
		b2.brand="Borosil";
		b2.capacity=2;
		b2.color="black";
		b2.make="glass";
		b2.price=2000;
		
		System.out.println(b2.brand);
		System.out.println(b2.capacity);
		System.out.println(b2.color);
		System.out.println(b2.make);
		System.out.println(b2.price);

	}

}
