package com.qsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.entity.Department;
import com.qsp.responsestructure.ResponseStructure;
import com.qsp.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(value = "/saveDepartment")
	public ResponseEntity<ResponseStructure<Department>> saveDepartment(@RequestBody Department department){
		return departmentService.saveDepartment(department);
		
	}
}
