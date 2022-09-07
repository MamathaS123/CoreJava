package com.xworkz.DAO;

import com.xworkz.DTO.CricketDTO;

public class CricketDriver {

	public static void main(String[] args) {
		CricketDTO dto1 = new CricketDTO();
		
		dto1.setCaptain("Dravid");
		dto1.setSponsors("Sahara");
		dto1.setStadium("CST");
		dto1.setTeamID(1);
		dto1.setTeamName("RC");
		
        CricketDTO dto2 = new CricketDTO();
		
		dto2.setCaptain("Dhoni");
		dto2.setSponsors("Kingfisher");
		dto2.setStadium("ddd");
		dto2.setTeamID(2);
		dto2.setTeamName("CSK");
		
		CricketDAO dao = new CricketDAOimplementation();
		
		dao.saveCricketDTO(dto1);
		dao.saveCricketDTO(dto2);
		

	}

}
