package com.xworkz.chocolate.dto;

public class DairymilkDTO {
	private String type;
	private int price;
	private String name;
	private long gstno;
	private KitkatDTO kitkatdto;
	
	public DairymilkDTO() {
		System.out.println("no arg constructor");
	}

	public DairymilkDTO(String type, int price, String name, long gstno, KitkatDTO kitkatdto) {
		super();
		this.type = type;
		this.price = price;
		this.name = name;
		this.gstno = gstno;
		this.kitkatdto = kitkatdto;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public long getGstno() {
		return gstno;
	}

	public KitkatDTO getKitkatdto() {
		return kitkatdto;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGstno(long gstno) {
		this.gstno = gstno;
	}

	public void setKitkatdto(KitkatDTO kitkatdto) {
		this.kitkatdto = kitkatdto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (gstno ^ (gstno >>> 32));
		result = prime * result + ((kitkatdto == null) ? 0 : kitkatdto.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		DairymilkDTO other = (DairymilkDTO) obj;
		if (gstno != other.gstno)
			return false;
		if (kitkatdto == null) {
			if (other.kitkatdto != null)
				return false;
		} else if (!kitkatdto.equals(other.kitkatdto))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DairymilkDTO [type=" + type + ", price=" + price + ", name=" + name + ", gstno=" + gstno
				+ ", kitkatdto=" + kitkatdto + ", getType()=" + getType() + ", getPrice()=" + getPrice()
				+ ", getName()=" + getName() + ", getGstno()=" + getGstno() + ", getKitkatdto()=" + getKitkatdto()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
