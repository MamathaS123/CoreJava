package com.xworkz.chocolate.dao;

import com.xworkz.chocolate.dto.ChocolateDTO;



public interface ChocolateDAO {
	public abstract boolean save(ChocolateDTO chocolateDTO);
	public abstract boolean updateByName(String name, ChocolateDTO chocolateDTO);
	public abstract void deleteChocolateByName(String name);

}
