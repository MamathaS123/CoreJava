package com.xworkz.methods;

public class Temperature {
	public static double getTemperature() {
		return 24.5;
	}
	public static void entryCheck(double temp) {
		if (temp>20.0) {
			System.out.println("Entry provided");
		}else {
			System.out.println("No Entry");
		}
	}
	public static void main(String[] args) {
		double temperature = Temperature.getTemperature();
		Temperature.entryCheck(temperature);
	}
    
}
