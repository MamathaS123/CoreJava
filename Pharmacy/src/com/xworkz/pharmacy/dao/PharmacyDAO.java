package com.xworkz.pharmacy.dao;

import com.xworkz.pharmacy.dto.PharmacyDTO;

public interface PharmacyDAO {
	
	public abstract boolean save(PharmacyDTO pharmacydto);
	public abstract boolean updateByName(String name, PharmacyDTO pharmacydto);

}
