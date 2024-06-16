package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	@Autowired
	private String cityname;

//	public String getCityname() {
//		return cityname;
//	}
//
//	public void setCityname(String cityname) {
//		this.cityname = cityname;
//	}

	@Override
	public String toString() {
		return "Address [cityname=" + cityname + "]";
	}

	public Address(String cityname) {
		super();
		this.cityname = cityname;
	}	
	public Address()
	{
		
	}
	
}
