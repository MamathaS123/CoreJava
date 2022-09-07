package com.xworkz.pharmacy.dto;

import java.io.*;


public class PharmacyDTO implements Serializable{
	private String name;
	private String location;
	private long gstNo;
	private boolean license;
	private MedicineDTO medicineDTO;
	
	public PharmacyDTO() {
		
	}
	

	public PharmacyDTO(String name, String location, long gstNo, boolean license, MedicineDTO medicineDTO) {
		super();
		this.name = name;
		this.location = location;
		this.gstNo = gstNo;
		this.license = license;
		this.medicineDTO = medicineDTO;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getGstNo() {
		return gstNo;
	}

	public void setGstNo(long gstNo) {
		this.gstNo = gstNo;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public MedicineDTO getMedicineDTO() {
		return medicineDTO;
	}

	public void setMedicineDTO(MedicineDTO medicineDTO) {
		this.medicineDTO = medicineDTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (gstNo ^ (gstNo >>> 32));
		result = prime * result + (license ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((medicineDTO == null) ? 0 : medicineDTO.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PharmacyDTO other = (PharmacyDTO) obj;
		if (gstNo != other.gstNo)
			return false;
		if (license != other.license)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (medicineDTO == null) {
			if (other.medicineDTO != null)
				return false;
		} else if (!medicineDTO.equals(other.medicineDTO))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PharmacyDTO [name=" + name + ", location=" + location + ", gstNo=" + gstNo + ", license=" + license
				+ ", medicineDTO=" + medicineDTO + ", getName()=" + getName() + ", getLocation()=" + getLocation()
				+ ", getGstNo()=" + getGstNo() + ", isLicense()=" + isLicense() + ", getMedicineDTO()="
				+ getMedicineDTO() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
