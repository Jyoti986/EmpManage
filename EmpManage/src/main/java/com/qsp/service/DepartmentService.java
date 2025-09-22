package com.qsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.dao.DepartmentDAO;
import com.qsp.entity.Department;
import com.qsp.responsestructure.ResponseStructure;
@Service
public class DepartmentService {
	@Autowired
	DepartmentDAO departmentDAO;
	
	public ResponseEntity<ResponseStructure<Department>> saveDepartment(Department department){
		ResponseStructure<Department> structure = new ResponseStructure<>();
		structure.setMessage("Department saved successfully");
		structure.setData(departmentDAO.saveDepartment(department));
		structure.setStatusCode(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Department>>(structure,HttpStatus.CREATED);
	}
}
