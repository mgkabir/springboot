package com.cefalo.employee.controller;

import java.util.Collection;

import com.cefalo.employee.entity.Employee;
import com.cefalo.employee.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;

	public Collection<Employee> getAllEmployee() {
		return this.employeeService.getAllEmployee();
	}

}
