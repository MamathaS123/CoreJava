package com.xworkz.oops.inheritence;

public class Tester {

	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee();
		p.name = "BBB";
		p.empid = 111;
		p.salary = 25000;
		
		TempEmployee t = new TempEmployee();
		t.name = "CCC";
		t.empid = 222;
		t.salary = 35000;
		
		System.out.println("*********Permanent Employee**************");
		System.out.println(p.name);
		System.out.println(p.empid);
		System.out.println(p.bonus);
		System.out.println(p.hike);
		System.out.println("*********Temp Employee**************");
		System.out.println(t.name);
		System.out.println(t.empid);
		System.out.println(t.bonus);
		System.out.println(t.hike);
		

	}

}
