package com.cefalo.employee.service;

import java.util.Collection;

import com.cefalo.employee.dao.EmployeeDao;
import com.cefalo.employee.entity.Employee;

public class EmployeeService {
	
	private EmployeeDao employeeDao;
	
	
public Collection<Employee> getAllEmployee(){
		
		return this.employeeDao.getAllEmployee();
	}

}
