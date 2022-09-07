package com.xworkz.methods;

public class AC {
	public static void turnOn() {
		System.out.println("AC is ON");
	}
	public static void turnOff() {
		System.out.println("AC is OFF");
	}
	public static void temperatureDecrease() {
		System.out.println("AC temperature has been reduced");
	}
	public static void temperatureIncrease() {
		System.out.println("AC temperature has been increased");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC.temperatureDecrease();
		AC.temperatureIncrease();
		AC.turnOff();
		AC.turnOn();

	}

}
