package com.sapient.service;

public class OnrollEmp extends Employee {

	private double da;
	private double pf;

	public OnrollEmp(int empId, String empName, double salary) {
		super(empId, empName, salary);
		da = calcDa();
		pf = calcPf();
	}
	
	private double calcPf(){     
		return getSalary()*0.12;
	}

	public double calcDa(){       //still client cannot access because it is not under scope of super class
		return getSalary()*0.4;
	}
	@Override
	public double calcSal() {

		double sal = getSalary();

		return sal + da - pf;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10.2f%10.2f%30.2f%20s\n", da, pf, calcSal(), getClass().getSimpleName());
	}
	
	
	

}
