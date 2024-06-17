package com.autowire.service;

import com.autowire.model.Department;
import com.autowire.model.Employee;

public class EmployeeService {
    private Employee employee;
    private Department department;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee: " + employee.getName() + ", Department: " + department.getName());
    }

	public EmployeeService(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	public EmployeeService()
	{
		
	}
}
