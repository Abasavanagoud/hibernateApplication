package com.hbx3.enties;

import java.io.Serializable;

public class Bike implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   protected  int bikeNo;
   protected String bikeModelName;
   protected String Manufacturer;
   protected String rtaRegistrationNumber;
   protected float price;
public int getBikeNo() {
	return bikeNo;
}
public void setBikeNo(int bikeNo) {
	this.bikeNo = bikeNo;
}
public String getBikeModelName() {
	return bikeModelName;
}
public void setBikeModelName(String bikeModelName) {
	this.bikeModelName = bikeModelName;
}
public String getManufacturer() {
	return Manufacturer;
}
public void setManufacturer(String manufacturer) {
	Manufacturer = manufacturer;
}
public String getRtaRegistrationNumber() {
	return rtaRegistrationNumber;
}
public void setRtaRegistrationNumber(String rtaRegistrationNumber) {
	this.rtaRegistrationNumber = rtaRegistrationNumber;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Manufacturer == null) ? 0 : Manufacturer.hashCode());
	result = prime * result + ((bikeModelName == null) ? 0 : bikeModelName.hashCode());
	result = prime * result + bikeNo;
	result = prime * result + Float.floatToIntBits(price);
	result = prime * result + ((rtaRegistrationNumber == null) ? 0 : rtaRegistrationNumber.hashCode());
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
	Bike other = (Bike) obj;
	if (Manufacturer == null) {
		if (other.Manufacturer != null)
			return false;
	} else if (!Manufacturer.equals(other.Manufacturer))
		return false;
	if (bikeModelName == null) {
		if (other.bikeModelName != null)
			return false;
	} else if (!bikeModelName.equals(other.bikeModelName))
		return false;
	if (bikeNo != other.bikeNo)
		return false;
	if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
		return false;
	if (rtaRegistrationNumber == null) {
		if (other.rtaRegistrationNumber != null)
			return false;
	} else if (!rtaRegistrationNumber.equals(other.rtaRegistrationNumber))
		return false;
	return true;
}
@Override
public String toString() {
	return "Bike [bikeNo=" + bikeNo + ", bikeModelName=" + bikeModelName + ", Manufacturer=" + Manufacturer
			+ ", rtaRegistrationNumber=" + rtaRegistrationNumber + ", price=" + price + "]";
}
   
   
}
