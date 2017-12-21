package com.sapient.service;

public abstract class Employee {

	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	public void display(){
		
		System.out.printf("%10d%20s", empId, empName);
	}
	
	public abstract String isOutstanding();
	
}
