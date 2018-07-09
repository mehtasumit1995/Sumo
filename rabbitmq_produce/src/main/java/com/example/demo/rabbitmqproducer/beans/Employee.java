package com.example.demo.rabbitmqproducer.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private String dob;
	private int salary;
	private String department;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, String email, String dob, int salary, String department) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", dob=" + dob + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
	
	
	
	
	
	
}