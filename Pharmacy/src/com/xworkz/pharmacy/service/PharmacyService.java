package com.xworkz.pharmacy.service;

import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.DataIsInvalidException;

public interface PharmacyService {
	public abstract boolean validateAndSave(PharmacyDTO pharmacydto) throws DataIsInvalidException;
	public abstract boolean validateAndUpdate(String name,PharmacyDTO pharmacydto) throws DataIsInvalidException;

}
