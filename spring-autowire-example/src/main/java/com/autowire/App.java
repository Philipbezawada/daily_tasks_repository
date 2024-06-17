package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.service.EmployeeService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context;

        // byType
        context = new ClassPathXmlApplicationContext("applicationContext-byType.xml");
        EmployeeService employeeServiceByType = context.getBean("employeeService1", EmployeeService.class);
        employeeServiceByType.printEmployeeDetails();

        // byName
        context = new ClassPathXmlApplicationContext("applicationContext-byName.xml");
        EmployeeService employeeServiceByName = context.getBean("employeeService2", EmployeeService.class);
        employeeServiceByName.printEmployeeDetails();

        // constructor
        context = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        EmployeeService employeeServiceConstructor = context.getBean("employee-Service", EmployeeService.class);
        employeeServiceConstructor.printEmployeeDetails();

        // no
        context = new ClassPathXmlApplicationContext("applicationContext-no.xml");
        EmployeeService employeeServiceNo = context.getBean("employeeService4", EmployeeService.class);
        employeeServiceNo.printEmployeeDetails();
    }
}
