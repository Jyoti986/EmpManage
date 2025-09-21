package com.qsp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Table(name="department")
public class Department {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;  

	    @Column(nullable = false, unique = true)
	    private String name;   

	    private String description; 

	    private String location;    

	    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	    private List<Employee> employees;

		public Department() {
			super();
		}
		 public Department(Long id, String name, String description, String location, List<Employee> employees) {
				super();
				this.id = id;
				this.name = name;
				this.description = description;
				this.location = location;
				this.employees = employees;
			}
		 public Long getId() {
			 return id;
		 }
		 public String getName() {
			 return name;
		 }
		 public String getDescription() {
			 return description;
		 }
		 public String getLocation() {
			 return location;
		 }
		 public List<Employee> getEmployees() {
			 return employees;
		 }
		 public void setId(Long id) {
			 this.id = id;
		 }
		 public void setName(String name) {
			 this.name = name;
		 }
		 public void setDescription(String description) {
			 this.description = description;
		 }
		 public void setLocation(String location) {
			 this.location = location;
		 }
		 public void setEmployees(List<Employee> employees) {
			 this.employees = employees;
		 }
}
