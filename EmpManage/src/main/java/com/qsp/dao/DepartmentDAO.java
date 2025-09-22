package com.qsp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.entity.Department;
import com.qsp.repository.DepartmentRepository;

@Repository
public class DepartmentDAO {
	@Autowired
	private DepartmentRepository deptrepo;
	
	public Department saveDepartment(Department department) {
		return deptrepo.save(department);
	}
}
