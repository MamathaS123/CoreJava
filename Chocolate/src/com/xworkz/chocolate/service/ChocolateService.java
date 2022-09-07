package com.xworkz.chocolate.service;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.exception.DataIsInvalidException;


public interface ChocolateService {
	public abstract boolean validateAndSave(ChocolateDTO chocolateDTO) throws DataIsInvalidException;
	public abstract boolean validateAndUpdate(String name,ChocolateDTO chocolateDTO) throws DataIsInvalidException;

}
