package com.xworkz.methods;

public class BookMyShow {
	public static void registerAccount() {
		System.out.println("You have successfully registered to Bookmyshow.com");
	}
	public static void login() {
		System.out.println("Welcome to Bookmyshow");
	}
	public static void bookMovie() {
		System.out.println("Movie tickets booked successfully");
	}
	public static void bookMusicShow() {
		System.out.println("Music show tickets booked successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMyShow.bookMovie();
		BookMyShow.bookMusicShow();
		BookMyShow.login();
		BookMyShow.registerAccount();

	}

}
