package com.horemex2.entities;

import java.io.Serializable;

public class Address implements Serializable {
	protected int addressNo;
	protected String streetAdddress;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	public int getAddressNo() {
		return addressNo;
	}
	public void setAddressNo(int addressNo) {
		this.addressNo = addressNo;
	}
	public String getStreetAdddress() {
		return streetAdddress;
	}
	public void setStreetAdddress(String streetAdddress) {
		this.streetAdddress = streetAdddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressNo;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetAdddress == null) ? 0 : streetAdddress.hashCode());
		result = prime * result + zip;
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
		Address other = (Address) obj;
		if (addressNo != other.addressNo)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetAdddress == null) {
			if (other.streetAdddress != null)
				return false;
		} else if (!streetAdddress.equals(other.streetAdddress))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [addressNo=" + addressNo + ", streetAdddress=" + streetAdddress + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", country=" + country + "]";
	}
	

}
