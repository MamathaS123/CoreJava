package com.xworkz.oops.polymorphism;

public class Shapes {
	public void Area(int base, double height) {
		System.out.println("Area of triangle is " + 1/2*base*height);
	}
	public void Area(double radius) {
		System.out.println("Area of Circle is " + 3.14*radius*radius);
	}
	public void Area(double length, double breadth) {
		System.out.println("Area of Rectangle is " + length*breadth);
	}
	public void Area(float length) {
		System.out.println("Area of Square is " + 2*length);
	}
		
	

}
