package com.xworkz.oops.polymorphism;

public class Tester1 {

	public static void main(String[] args) {
		ApplicationV01 applicationv01 = new ApplicationV01();
		applicationv01.login();
		applicationv01.showTemp("Mysore");
		
		ApplicationV02 applicationv02 = new ApplicationV02();
		applicationv02.showTime();

	}

}
