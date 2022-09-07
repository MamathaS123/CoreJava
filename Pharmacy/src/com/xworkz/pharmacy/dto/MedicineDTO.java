package com.xworkz.pharmacy.dto;
import java.io.*;

public class MedicineDTO implements Serializable {
	private String name;
	private String expDate;
	private int dosage;
	private double price;
	
	public MedicineDTO() {
		
	}

	public MedicineDTO(String name, String expDate, int dosage, double price) {
		super();
		this.name = name;
		this.expDate = expDate;
		this.dosage = dosage;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getExpDate() {
		return expDate;
	}

	public int getDosage() {
		return dosage;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dosage;
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MedicineDTO other = (MedicineDTO) obj;
		if (dosage != other.dosage)
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MedicineDTO [name=" + name + ", expDate=" + expDate + ", dosage=" + dosage + ", price=" + price
				+ ", getName()=" + getName() + ", getExpDate()=" + getExpDate() + ", getDosage()=" + getDosage()
				+ ", getPrice()=" + getPrice() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
