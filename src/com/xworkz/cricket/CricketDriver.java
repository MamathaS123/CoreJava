package com.xworkz.cricket;

import com.xworkz.cricket.DAO.CricketDAO;
import com.xworkz.cricket.DAO.CricketDAOimplementation;
import com.xworkz.cricket.DTO.CricketDTO;

public class CricketDriver {

	public static void main(String[] args) {
		CricketDTO dto1 = new CricketDTO(1, "Dhoni", "Dhoni", 11, "India", "aaa", "dfdg");
		CricketDTO dto2 = new CricketDTO(2, "Dravid", "Dhoni", 11, "India", "bbb", "hghjgk");
		CricketDTO dto3 = new CricketDTO(3, "Sachin", "Dhoni", 11, "India", "ccc", "hjkhki");
		CricketDTO dto4 = new CricketDTO(4, "Ricky", "Harry", 11, "Aus", "ddd", "jhik");
		CricketDTO dto5 = new CricketDTO(5, "ABD", "Tom", 11, "USA", "eee", "gjhk");
		CricketDTO dto6 = new CricketDTO(6, "Rishab", "Dhoni", 11, "India", "fff", "fghgj");
		CricketDTO dto7 = new CricketDTO(7, "Virat", "Dhoni", 11, "India", "ggg", "ghjghk");
		CricketDTO dto8 = new CricketDTO(8, "Hardhik", "Dhoni", 11, "India", "aaa", "gyi8");

		CricketDAO dao = new CricketDAOimplementation();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto7);
		dao.save(dto6);

		dao.findTeamByCountryName("Aus");
		dao.findTeamByCountryName(null);
		dao.findTeamByCountryNameAndCaptainName(null, null);
		dao.findTeamByCountryCaptainAndSponsor(null, null, null);
		dao.updateTeamByCaptain("Tom", dto1);
		dao.deleteTeamByStadium("bbb");

	}

}
