package com.xworkz.oops;

public class Laptop {
	String brand;
	double price;
	String color;
	String specification;
	
	public Laptop(){
		System.out.println("non param cons");
		
	}
	
	public Laptop(String brand, double price, String color, String specification) {
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.specification = specification;
		System.out.println("param cons");
	}
	
	public String toString() {
		return "Laptop [brand "+this.brand+"price"+ this.price+"color"+this.color+"specification"+this.specification ;
		
	}
	
	public int hashCode() {
		return 500;
	}
	

}
