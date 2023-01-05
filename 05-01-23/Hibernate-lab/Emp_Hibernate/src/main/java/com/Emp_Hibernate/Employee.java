package com.Emp_Hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Entity - This annotation specifies that the class is an entity.
//@Table - This annotation specifies the table in the database with which this entity
//@Id - This annotation specifies the primary key of the entity
@Getter
@Setter
@Entity //marking this class as entity
//specifies the table name where data of this entity is to be persisted.
@Table(name="Employee_info")
public class Employee {
	@Id //Marks identifier of class
	private int EmpId;
	private String empFirstName,empLastName,empEmail,empAddr,empPhone,empAge;
	private double empSalary;
	
}