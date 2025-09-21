package com.qsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.entity.Employee;
import com.qsp.entity.ResponseStructure;
import com.qsp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/saveEmployee")
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
		
	}
}
