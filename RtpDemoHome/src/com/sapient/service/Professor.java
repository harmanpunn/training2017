package com.sapient.service;

public class Professor extends Employee {
	
	private float rating;

	public Professor(int empId, String empName, float rating) {
		super(empId, empName);
		this.rating = rating;
	}

	@Override
	public String isOutstanding() {
		String res = null; 
		if(rating >= 5)
			res="Outstanding";
		else res = "Not Outstanding";
		return res;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10.2f%30s%20s\n", rating, isOutstanding(), getClass().getSimpleName());
	}
	
	

}
