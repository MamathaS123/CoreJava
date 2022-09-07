package com.xworkz.DAO;

import com.xworkz.DTO.CricketDTO;

public class CricketDAOimplementation extends CricketDAO {
	
	public CricketDTO updateCricketByCaptain(String Captain, CricketDTO dto) {
		
		if(Captain==null && dto==null) {
			System.out.println("objects are null");
			return null;
		}
		
		CricketDTO[] superArray=super.getDtos();
		for(int i=0;i<superArray.length;i++) {
			if(superArray[i]!=null && superArray[i].getCaptain().equals(Captain)) {
				superArray[i]=dto;
				System.out.println("New DTo is updated at index" +i);
				return superArray[i];
			}
		}
		System.out.println("Captain not found");
		return null;
		
	}
	
	

}
