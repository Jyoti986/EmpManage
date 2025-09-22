package com.qsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.dao.EmployeeDAO;
import com.qsp.entity.Employee;
import com.qsp.responsestructure.ResponseStructure;
@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO employeeDAO;
	
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee employee){
		ResponseStructure<Employee> structure = new ResponseStructure<>();
		structure.setMessage("Employee saved successfully");
		structure.setData(employeeDAO.saveEmployee(employee));
		structure.setStatusCode(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Employee>>(structure,HttpStatus.CREATED);
	}
}
