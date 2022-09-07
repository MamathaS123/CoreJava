package com.xworkz.pharmacy.dao;

import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.ArrayIsFullException;

public class pharmacyDAOImpl implements PharmacyDAO {
	
	private PharmacyDTO[] dtos=new PharmacyDTO[5];
	private int counter=0;

	@Override
	public boolean save(PharmacyDTO pharmacydto) {
		
		if(pharmacydto==null) {
			System.out.println("Object is null cannot be saved");
			return false;
		}
		if(this.counter<this.dtos.length) {
			this.dtos[counter]=pharmacydto;
			System.out.println("the pharmacy is stored at index "+this.counter);
			this.counter++;
			return true;
		}
		
		else {
			System.out.println("pharmacy cannot be stored as array is full");
			throw new ArrayIsFullException("Array is full change ur code");
		}
	}

	@Override
	public boolean updateByName(String name, PharmacyDTO pharmacydto) {
		if(pharmacydto==null && name==null) {
			System.out.println("object is null cannot be saved");
			return false;
		}
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null && dtos[index].getName().equals(name)) {
				this.dtos[index]=pharmacydto;
				return true;
			}
			else {
				System.out.println("name is not found");
				return false;
			}
		}
		return false;
	}
	

}
