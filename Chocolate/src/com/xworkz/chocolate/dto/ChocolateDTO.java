package com.xworkz.chocolate.dto;

public class ChocolateDTO {
	
	private String type;
	private int price;
	private String flavour;
	private String name;
	private long gstno;
	private DairymilkDTO dairymilkdto;
	
	public ChocolateDTO() {
		System.out.println("no arg constructor");
	}

	public ChocolateDTO(String type, int price, String flavour, String name, long gstno, DairymilkDTO dairymilkdto) {
		super();
		this.type = type;
		this.price = price;
		this.flavour = flavour;
		this.name = name;
		this.gstno = gstno;
		this.dairymilkdto = dairymilkdto;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getName() {
		return name;
	}

	public long getGstno() {
		return gstno;
	}

	public DairymilkDTO getDairymilkdto() {
		return dairymilkdto;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGstno(long gstno) {
		this.gstno = gstno;
	}

	public void setDairymilkdto(DairymilkDTO dairymilkdto) {
		this.dairymilkdto = dairymilkdto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dairymilkdto == null) ? 0 : dairymilkdto.hashCode());
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		result = prime * result + (int) (gstno ^ (gstno >>> 32));
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
		ChocolateDTO other = (ChocolateDTO) obj;
		if (dairymilkdto == null) {
			if (other.dairymilkdto != null)
				return false;
		} else if (!dairymilkdto.equals(other.dairymilkdto))
			return false;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		if (gstno != other.gstno)
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
		return "ChocolateDTO [type=" + type + ", price=" + price + ", flavour=" + flavour + ", name=" + name
				+ ", gstno=" + gstno + ", dairymilkdto=" + dairymilkdto + ", getType()=" + getType() + ", getPrice()="
				+ getPrice() + ", getFlavour()=" + getFlavour() + ", getName()=" + getName() + ", getGstno()="
				+ getGstno() + ", getDairymilkdto()=" + getDairymilkdto() + ", hashCode()=" + hashCode() + "]";
	}
	

}
