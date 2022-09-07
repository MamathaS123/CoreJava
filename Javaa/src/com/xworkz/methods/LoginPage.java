
package com.xworkz.methods;

public class LoginPage {
	public static void userLogin(int password) {
		int pwd = 12345;
		if(password==pwd) {
			System.out.println("Login successfully");
		}else {
			System.out.println("incorrect password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage.userLogin(1234);

	}

}
