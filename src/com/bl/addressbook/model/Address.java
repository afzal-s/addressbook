package com.bl.addressbook.model;

public class Address {
	private String landMark;
	private String city;
	private String state;
	private String zipCode;

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
}
