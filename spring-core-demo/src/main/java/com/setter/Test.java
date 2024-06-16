package com.setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//get the bean.. using ApplicationContext Interface implementation class-- ClassPathXmlApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		// then get the bean of, respective type of the bean.
		StudentBean student=(StudentBean)context.getBean("stu");
		
		student.setStid(100);
		student.setStname("Philip");
		
		student.display();
		System.out.println(student);
	}
}
