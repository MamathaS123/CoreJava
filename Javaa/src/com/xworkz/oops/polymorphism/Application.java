package com.xworkz.oops.polymorphism;

public class Application {
	
	Application(){
		System.out.println("Inside application constructor");
	}
	
	public void login() {
		System.out.println("Login successfull");
	}
	public void showTime() {
		System.out.println("24 hrs format");
		System.out.println("13.50");
	}
	public void showTemp(String location) {
		System.out.println("display temp in farenheit");
		System.out.println("70F");
	}

}
