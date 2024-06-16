package com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterPropertyTest {

	public static void main(String[] args) {
		// use property<> tag- to set Stid, Stname in context.xml
		//used  constructor-arg tag..
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentBean student =(StudentBean)context.getBean("stu");
		System.out.println(student);
	}

}
