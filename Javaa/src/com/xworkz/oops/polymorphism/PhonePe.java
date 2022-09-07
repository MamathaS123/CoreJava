package com.xworkz.oops.polymorphism;

public class PhonePe {

	public void recharge(long phoneNumber, int amount) {
		System.out.println("Phone recharge successfull");
	}
	public void recharge(String CardNumber, int amount) {
		System.out.println("DTH recharge successfull");
	}
	public void recharge(Long phoneNumber) {
		System.out.println("Postpaid bill paid");
	}
	public void recharge(String userID) {
		System.out.println("Wifi recharge successfull");
	}

}
