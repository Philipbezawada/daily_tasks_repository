package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("stu")
public class Student {
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
//
//	
		public Address getAddress() {
			return address;
		}
	
		public void setAddress(Address address) {
			this.address = address;
		}
//		public Student(Address address) {
//			super();
//			this.address = address;
//		}
//		public Student()
//		{
//			
//		}
//
//	
//	
}
