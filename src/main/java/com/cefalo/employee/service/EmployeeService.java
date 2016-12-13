package com.cefalo.employee.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cefalo.employee.dao.EmployeeDao;
import com.cefalo.employee.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
public Collection<Employee> getAllEmployee(){
		
		return this.employeeDao.getAllEmployee();
	}

}
