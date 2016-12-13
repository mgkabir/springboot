package com.cefalo.employee.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cefalo.employee.entity.Employee;
import com.cefalo.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method=RequestMethod.GET)
	public Collection<Employee> getAllEmployee() {
		return this.employeeService.getAllEmployee();
	}

}
