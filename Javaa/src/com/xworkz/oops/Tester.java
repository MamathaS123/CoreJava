package com.xworkz.oops;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fan fan = new Fan();
		System.out.println("Before initialize");
		System.out.println(fan.brand);
		System.out.println(fan.inputpower);
		
		fan.color="blue";
		fan.brand="bajaj";
		fan.inputpower=3.2;
		
		System.out.println("After initialize");
		System.out.println(fan.brand);
		System.out.println(fan.inputpower);
		
		System.out.println("**********************************************************");
		
		SunGlass sg = new SunGlass();
		sg.brand="Rayban";
		sg.color="blue";
		sg.price=5000;
		System.out.println(sg.brand);
		System.out.println(sg.color);
		System.out.println(sg.price);
		
		System.out.println("*********************************************************");
		
		Shoes s = new Shoes();
		s.brand="Nike";
		s.color="White";
		s.price=4555;
		s.size=7.2;
		s.type="sneakers";
		System.out.println(s.brand);
		System.out.println(s.color);
		System.out.println(s.price);
		System.out.println(s.size);
		System.out.println(s.type);
		
		Laptop laptop = new Laptop();
		Laptop laptop1 = new Laptop();
		
		boolean result1 = (laptop == laptop1);
		System.out.println("using == operator :"+ result1);
		
		boolean result2 = laptop.equals(laptop1);
		System.out.println("using equals() operator :"+ result2);
		
		laptop.brand = "hp";
		laptop.color = "black";
		laptop.price = 85000;
		laptop.specification = "ddgfjhhkjkl";
		
		System.out.println(laptop.brand);
		System.out.println(laptop.color);
		System.out.println(laptop.price);
		System.out.println(laptop.specification);*/
		
		Laptop laptop = new Laptop(" hp ",  85000 , " black ", " dfhgujhil ");
		System.out.println(laptop);
		System.out.println(laptop.toString());
		
		

	}

}
