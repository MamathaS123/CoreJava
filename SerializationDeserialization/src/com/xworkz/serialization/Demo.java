package com.xworkz.serialization;
import java.io.*;

public class Demo implements java.io.Serializable {
	public int a;
    public String b;
	public Demo(int i, String string) {
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}

}
