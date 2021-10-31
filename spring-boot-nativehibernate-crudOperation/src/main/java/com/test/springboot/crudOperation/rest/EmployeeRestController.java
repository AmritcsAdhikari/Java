package com.test.springboot.crudOperation.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.crudOperation.entity.Employee;
import com.test.springboot.crudOperation.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		
		return employeeService.findAll();
	}
	
	// GET  /employees/{employeeId}
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee = employeeService.findById(employeeId);
		
		if( theEmployee == null) {
			throw new RuntimeException("Employee id not found -" + employeeId);
		}
		return theEmployee;
	}
	
	
	//POST /employees - add new employee
	
	@PostMapping("/employees")
	public Employee addEmployee (@RequestBody Employee theEmployee) {
		
		theEmployee.setId(0);
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	// PUT /employees -- update the existing employee
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	
	// DELETE /employees/{employeeId} --delete employee
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee tempEmployee = employeeService.findById(employeeId);
		
		if(tempEmployee == null) {
			throw new RuntimeException("Employee id not found -" + employeeId);
		}
		employeeService.deleteById(employeeId);
		return "Deleted employee id -" + employeeId;
	}
	
	
	
	
	
}
