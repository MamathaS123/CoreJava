package com.xworkz.pharmacy.dao;

import com.xworkz.pharmacy.dto.PharmacyDTO;

public class ParmacyDAOImpl implements PharmacyDAO{
	
	private PharmacyDTO[] dtos=new PharmacyDTO[5];
	private int counter=0;
	
	public ParmacyDAOImpl() {
		System.out.println("generated -"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PharmacyDTO pharmacydto) {
		if(pharmacydto==null) {
			System.out.println("object is null cannot be saved");
			return false;
		}
		if(this.counter<this.dtos.length) {
			this.dtos[counter]=pharmacydto;
			System.out.println("pharmacy is stored at index"+this.counter);
			this.counter++;
			return true;
		}
		else {
			System.out.println("pharmacy cannot be stored array is full");
			return false;//throw new Arrayfull();
		}
	}
	

}
