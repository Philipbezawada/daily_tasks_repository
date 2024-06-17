package com.techm;

public class Student {
	
	private int stid;
	private String stname;
	
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
	
	public Student()
	{
		
	}
	public Student(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}

	
}

