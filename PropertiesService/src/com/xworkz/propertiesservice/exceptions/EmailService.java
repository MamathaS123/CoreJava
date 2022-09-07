package com.xworkz.propertiesservice.exceptions;

public class EmailService {
	public String[] emails=new String[5];
	int counter=0;
	
	public boolean saveEmail(String email) throws Exception {
		if(email!=null) {
			if(email.length()<5)
				System.out.println("email length is not valid");
			throw new InvalidDataException("Email length is not valid");
		}
		if(this.counter<emails.length) {
			this.emails[counter]=email;
			System.out.println("Email is saved at index: "+ this.counter);
			this.counter++;
			return true;
		}
		else {
			throw new ArrayIsFull("Array is full");
		}
	}
	

}else {
	
}
