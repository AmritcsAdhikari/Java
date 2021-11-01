package com.test.springboot.crudOperation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.springboot.crudOperation.entity.Employee;


@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//there's no need to write implementation class
	//we get all the crud methods for free
	//----------good thing about spring-data-jpa-------------
}
