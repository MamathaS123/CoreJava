package com.xworkz.serialization;
import java.io.*;

public class Tester1    {
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		System.out.println("Serialization started");
		try {
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.writeObject(b1);
		System.out.println("Serialization ended");
		}
		catch(IOException ex)
	    {
	        System.out.println("IOException is caught");
	    }
		
		System.out.println("Deserialization started");
		
		try {
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		try {
			A a2=(A)ois.readObject();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			B b2=(B)ois.readObject();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Deserialization ended");
		}
		catch(IOException ex)
	    {
	        System.out.println("IOException is caught");
	    }
		
		System.out.println(a1.i+"................"+a1.j);
		System.out.println(b1.i+"................"+b1.j);
	}

}
