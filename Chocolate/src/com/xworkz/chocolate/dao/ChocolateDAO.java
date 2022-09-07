package com.xworkz.chocolate.dao;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.dto.DairymilkDTO;



public interface ChocolateDAO {
	public abstract boolean save(ChocolateDTO chocolateDTO);
	public abstract boolean updateByName(String name, ChocolateDTO chocolateDTO);
	public abstract boolean deleteChocolateByName(String name);
	public abstract boolean findDuplicate(ChocolateDTO chocolateDTO);
	public abstract boolean findChocolateByType(String type);
	public abstract boolean findChocolateByName(String name);
	public abstract boolean findChocolateByPrice(int price);
	public abstract boolean deleteChocolateByType(String type);

}
