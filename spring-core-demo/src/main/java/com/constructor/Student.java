package com.constructor;

import java.util.Map;

public class Student {
	private int stid;
	private String stname;
	
	private Map<String,String> address;


	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public Map<String,String> getAddress() {
		return address;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}


	public Student(int stid, String stname, Map<String,String> address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", address=" + address + "]";
	}
	
	}
