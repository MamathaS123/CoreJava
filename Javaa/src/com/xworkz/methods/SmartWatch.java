package com.xworkz.methods;

public class SmartWatch {
	public static void steps() {
		System.out.println("Total number of steps walked today has been successfully");
	}
	public static void heartBeatRate() {
		System.out.println("Current Heart beat rate is .....");
	}
	public static void bodyTemperature() {
		System.out.println("Current Body temperature is .....");
	}
	public static void message() {
		System.out.println("You got a message");
	}
	public static void call() {
		System.out.println("You are getting call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch.bodyTemperature();
		SmartWatch.call();
		SmartWatch.message();
		SmartWatch.steps();

	}

}
