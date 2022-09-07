package com.xworkz.chocolate.dao;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.exception.ArrayIsFullException;




public class ChocolateDAOImplementation implements ChocolateDAO {
	private ChocolateDTO[] dtos=new ChocolateDTO[9];
	private int counter=0;

	@Override
	public boolean save(ChocolateDTO chocolateDTO) {
		if(chocolateDTO==null) {
			System.out.println("Object is null cannot be saved");
		return false;
		}
		if(this.counter<this.dtos.length) {
			this.dtos[counter]=chocolateDTO;
			System.out.println("the chocolate is stored at index "+this.counter);
			this.counter++;
			return true;
		}
		else {
			System.out.println("chocolate cannot be stored as array is full");
			throw new ArrayIsFullException("Array is full change ur code");
		}
	
	}

	@Override
	public boolean updateByName(String name, ChocolateDTO chocolateDTO) {
		if(chocolateDTO==null && name==null) {
			System.out.println("object is null cannot be saved");
			return false;
		}
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null && dtos[index].getName().equals(name)) {
				this.dtos[index]=chocolateDTO;
				return true;
			}
			else {
				System.out.println("name is not found");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean deleteChocolateByName(String name) {
		if (name == null) {
			System.out.println("null cannot be deleted");
			return false;
		}
		for (int z = 0; z < this.dtos.length; z++) {
			if (this.dtos[z] != null && this.dtos[z].getDairymilkdto().getName().equals(name))

			{
				this.dtos[z] = null;
				System.out.println("deleted at the index " + z);
				
			}
		}
		return false;
		
		
	}

	@Override
	public boolean findDuplicate(ChocolateDTO chocolateDTO) {
		if (chocolateDTO != null) {
			for (int i = 0; i < this.dtos.length; i++) {
				if (this.dtos[i] != null && this.dtos[i].equals(chocolateDTO)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean findChocolateByType(String type) {
		if (type == null) {
			System.out.println("Do not pass null value");
			return false;
		}
		for (int a = 0; a < this.dtos.length; a++) {
			if (this.dtos[a] != null && this.dtos[a].getDairymilkdto().getType().equals(type)) {
				System.out.println(this.dtos[a].getDairymilkdto().getName());
				System.out.println("Found at the index " + a);
				return true;
			}
		}
		System.out.println("cannot find");
		return false;
	}

	@Override
	public boolean findChocolateByName(String name) {
		if (name == null) {
			System.out.println("Do not pass null");
			return false;
		}

		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getDairymilkdto().getName().equals(name)) {
				System.out.println(this.dtos[i].getDairymilkdto().getName());
				System.out.println("found at the index " + i);
				return true;
			}
		}
		System.out.println("cannot find");
		return false;
	}

	@Override
	public boolean findChocolateByPrice(int price) {
		if (price <= 0) {
			System.out.println("Do not pass null");
			return false;
		}

		for (int i = 0; i < this.dtos.length; i++) {
			if (this.dtos[i] != null && this.dtos[i].getDairymilkdto().getName().equals(dtos)) {
				System.out.println(this.dtos[i].getDairymilkdto().getPrice());
				System.out.println("found at the index " + i);
				return true;
			}
		}
		System.out.println("cannot find");
		return false;
	}

	@Override
	public boolean deleteChocolateByType(String type) {
		for (int z = 0; z < this.dtos.length; z++) {
			if (this.dtos[z] != null && this.dtos[z].getType().equals(type))

			{
				this.dtos[z] = null;
				System.out.println("deleted at the index " + z);
				
			}
		}
		return false;
		
	}

}
