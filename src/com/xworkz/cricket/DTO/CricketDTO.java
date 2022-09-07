package com.xworkz.cricket.DTO;

public class CricketDTO {

	private int id;
	private String name;
	private String captain;
	private int teamsize;
	private String country;
	private String stadium;
	private String sponsor;

	public CricketDTO() { // default no arg constructor
		System.out.println("default no arg constructor");
	}

//parameterized constructors with setters and getters
	public CricketDTO(int id, String name, String captain, int teamsize, String country, String stadium,
			String sponsor) {
		super();
		this.id = id;
		this.name = name;
		this.captain = captain;
		this.teamsize = teamsize;
		this.country = country;
		this.stadium = stadium;
		this.sponsor = sponsor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	@Override
	public String toString() {
		return "CricketDTO [id=" + id + ", name=" + name + ", captain=" + captain + ", teamsize=" + teamsize
				+ ", country=" + country + ", stadium=" + stadium + ", sponsor=" + sponsor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((captain == null) ? 0 : captain.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sponsor == null) ? 0 : sponsor.hashCode());
		result = prime * result + ((stadium == null) ? 0 : stadium.hashCode());
		result = prime * result + teamsize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CricketDTO other = (CricketDTO) obj;
		if (captain == null) {
			if (other.captain != null)
				return false;
		} else if (!captain.equals(other.captain))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sponsor == null) {
			if (other.sponsor != null)
				return false;
		} else if (!sponsor.equals(other.sponsor))
			return false;
		if (stadium == null) {
			if (other.stadium != null)
				return false;
		} else if (!stadium.equals(other.stadium))
			return false;
		if (teamsize != other.teamsize)
			return false;
		return true;
	}

}
