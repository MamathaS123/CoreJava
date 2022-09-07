package com.xworkz.DAO;

import com.xworkz.DTO.CricketDTO;

public class CricketDAO {
	public CricketDTO[] dtos = new CricketDTO[11];
	int index=0;
	
	public boolean saveCricketDTO(CricketDTO dto) {
		if(dto==null) {
			System.out.println("DTO IS NULL CANNOT BE SAVED");
			return false;
		}
		if(this.index<dtos.length) {
			this.dtos[index]=dto;
			this.index++;
			System.out.println("Saved dto in index" +this.index);
			return true;
		}else {
			System.out.println("DTO array is full cannot save");
		}
		return false;
		
	}
	
	public boolean findDuplicate(CricketDTO dto) {
		if(dto==null) {
			System.out.println("DTO is null cannot run equals method");
		}
		return false;
		
	}

	public CricketDTO[] getDtos() {
		// TODO Auto-generated method stub
		return null;
	}

}
