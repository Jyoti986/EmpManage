package com.qsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@ToString
@Table(name="employee")
public class Employee {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;   

	    @Column(nullable = false)
	    private String firstName;

	    @Column(nullable = false)
	    private String lastName;

	    @Column(nullable = false, unique = true)
	    private String email;

	    private Integer phone;
	    
	    @ManyToOne
	    @JoinColumn(name="department_id")
	    private Department department;

	    private String position;

	    private Double salary;

	    private String status;

		public Employee() {
			super();
		}

		public Employee(Integer id, String firstName, String lastName, String email, Integer phone,
				Department department, String position, Double salary, String status) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
			this.department = department;
			this.position = position;
			this.salary = salary;
			this.status = status;
		}

		public Integer getId() {
			return id;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getEmail() {
			return email;
		}

		public Integer getPhone() {
			return phone;
		}

		public Department getDepartment() {
			return department;
		}

		public String getPosition() {
			return position;
		}

		public Double getSalary() {
			return salary;
		}

		public String getStatus() {
			return status;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPhone(Integer phone) {
			this.phone = phone;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	    
	    
		

}
