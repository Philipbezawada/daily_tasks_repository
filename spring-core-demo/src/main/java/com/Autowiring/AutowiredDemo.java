package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDemo {
	public static void main(String[] args) {
			 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Student student=context.getBean(Student.class);
		System.out.println(student);
	}
}	
