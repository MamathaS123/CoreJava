package com.xworkz.chocolate.dao;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.exception.ArrayIsFullException;




public class ChocolateDAOImplementation implements ChocolateDAO {
	private ChocolateDTO[] dtos=new ChocolateDTO[2];
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
	public void deleteChocolateByName(String name) {
		if (name == null) {
			System.out.println("null cannot be deleted");
			return;
		}
		//ChocolateDTO[] superArray = super.getdto();
		//for (int i = 0; i < superArray.length; i++) {
			//if (superArray[i] != null && superArray[i].getStadium().equals(stadium)) {
				//superArray[i] = null;
				//System.out.println("deleted at index" + i);
				//return;
			//}
		
		
	}

}
