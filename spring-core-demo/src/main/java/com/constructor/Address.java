package com.constructor;

public class Address {
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Address(String cityName) {
		super();
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + "]";
	}
	
}
