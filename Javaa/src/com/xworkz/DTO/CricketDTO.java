package com.xworkz.DTO;

public class CricketDTO {
	String TeamName;
	String Captain;
	String Sponsors;
	String Stadium;
	int TeamID;
	
	public CricketDTO() {
		System.out.println("Created Cricket DTO");
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getCaptain() {
		return Captain;
	}

	public void setCaptain(String captain) {
		Captain = captain;
	}

	public String getSponsors() {
		return Sponsors;
	}

	public void setSponsors(String sponsors) {
		Sponsors = sponsors;
	}

	public String getStadium() {
		return Stadium;
	}

	public void setStadium(String stadium) {
		Stadium = stadium;
	}

	public int getTeamID() {
		return TeamID;
	}

	public void setTeamID(int teamID) {
		TeamID = teamID;
	}

}
