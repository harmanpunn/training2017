package com.sapient.service;

public class ContractEmp extends Employee{
	
	private int days;

	public ContractEmp(int empId, String empName, double salary, int days) {
		super(empId, empName, salary);
		this.days = days;
	}

	@Override
	public double calcSal() {
		double sal = getSalary();
		
		return sal*days;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%30d%20.2f%20s\n", days, calcSal(), getClass().getSimpleName());
	}
	
	

}
