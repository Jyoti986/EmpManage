package com.qsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
