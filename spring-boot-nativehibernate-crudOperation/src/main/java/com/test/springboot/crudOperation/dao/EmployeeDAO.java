package com.test.springboot.crudOperation.dao;

import java.util.List;

import com.test.springboot.crudOperation.entity.Employee;

public interface EmployeeDAO {
	
	//simply returns the list of employee
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
