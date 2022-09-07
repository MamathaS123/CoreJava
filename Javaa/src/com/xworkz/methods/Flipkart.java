package com.xworkz.methods;

public class Flipkart {
	public static void addToCart() {
		System.out.println("Selected items added to cart");
	}
	public static void removeFromCart() {
		System.out.println("Selected items removed from cart");
	}
	public static void search() {
		System.out.println("Below are the search results");
	}
	public static void orderPlaced() {
		System.out.println("Your order request has been placed successfully");
	}
	public static void orderCancellation() {
		System.out.println("Your order request has been cancelled");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart.addToCart();
		Flipkart.orderCancellation();
		Flipkart.removeFromCart();
		Flipkart.search();

	}

}
