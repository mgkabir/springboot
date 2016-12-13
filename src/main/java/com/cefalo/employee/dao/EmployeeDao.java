package com.cefalo.employee.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cefalo.employee.entity.Employee;



@Repository
public class EmployeeDao {
	
	private static Map<Integer, Employee> employees;
	
	static {
		
		employees = new HashMap<Integer,Employee>();
		employees.put(1, new Employee(1,"Satyajit", "Java"));
		employees.put(2, new Employee(2,"John", "QA"));
		employees.put(3, new Employee(3,"Arif", ".NET"));
	}
	
	
	public Collection<Employee> getAllEmployee(){
		
		return this.employees.values();
	}

	public Employee getEmployee(int Id){
		return this.employees.get(Id);
	}
}