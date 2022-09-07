package com.xworkz.methods;

public class Phone {
	public static void incomingCall() {
		System.out.println("You are getting a call");
	}
	public static void outgoingCall() {
		System.out.println("You are making a call");
	}
	public static void newMessage() {
		System.out.println("You got a new message");
	}	
	public static void camera() {
		System.out.println("You camera is ready to take a picture");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone.camera();
		Phone.incomingCall();
		Phone.newMessage();
		Phone.outgoingCall();

	}

}
