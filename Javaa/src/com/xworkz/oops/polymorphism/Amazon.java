package com.xworkz.oops.polymorphism;

public class Amazon {
	public void payment(long acntnum, String pwd, double amount){
		System.out.println("Payment done thru netbanking");
	}
	public void payment(int amount){
		System.out.println("Payment done thru COD");
	}
	public void payment(double cardnum, int cvv, int OTP, double amount){
		System.out.println("Payment done thru Credit Card");
	}

}
