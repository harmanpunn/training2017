package com.sapient.service;

public class Trainee extends Employee {

	private float percent;

	public Trainee(int empId, String empName, float percent) {
		super(empId, empName);
		this.percent = percent;
	}


	
	@Override
	public String isOutstanding() {
		String res = null;
		if(percent >= 90)
			res = "Outstanding";
		else res = "Not Outstanding";
			return res;
		}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10.2f%30s%20s\n", percent, isOutstanding(), getClass().getSimpleName());
	}
	
	

}
