package com.xworkz.serialization;
import java.io.*;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Tester {

	public static void main(String[] args) {
		Demo object = new Demo(1, "ABC");
        String filename = "file.ser";

	
	
	try
    {   
        String filename1 = null;
		//Saving of object in a file
        FileOutputStream file = new FileOutputStream(filename1);
        ObjectOutputStream out = new ObjectOutputStream(file);
        
        
        Object object1 = null;
		out.writeObject(object1);
        
        out.close();
        file.close();
          
        System.out.println("Object has been serialized");

    }
	catch(IOException ex)
    {
        System.out.println("IOException is caught");
    }
	
	Demo object1 = null;
	
	   try
       {   
           String filename1 = null;
		// Reading the object from a file
           FileInputStream file = new FileInputStream(filename1);
           ObjectInputStream in = new ObjectInputStream(file);
             
           // Method for deserialization of object
           object1 = (Demo)in.readObject();
             
           in.close();
           file.close();
             
           System.out.println("Object has been deserialized ");
           System.out.println("a = " + object1.a);
           System.out.println("b = " + object1.b);
       }
	   catch(IOException ex11)
       {
           System.out.println("IOException is caught");
       }
         
       catch(ClassNotFoundException ex1)
       {
           System.out.println("ClassNotFoundException is caught");
       }

}}
