package com.qsp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.entity.Employee;
import com.qsp.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	@Autowired
	private EmployeeRepository repository;
	
	//save employee
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
}
