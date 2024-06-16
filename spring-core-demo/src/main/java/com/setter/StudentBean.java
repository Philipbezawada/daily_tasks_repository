package com.setter;

public class StudentBean {
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
	public StudentBean()
	{
		
	}
	public StudentBean(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	public void display() {
		System.out.println("Student id:"+getStid());
		System.out.println("Student name:"+getStname());
	}
	@Override
	public String toString() {
		return "StudentBean [stid=" + stid + ", stname=" + stname + "]";
	}
	
}
