package com.qsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
