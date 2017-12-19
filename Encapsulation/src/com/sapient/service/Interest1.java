package com.sapient.service;

public class Interest1 {
// Writing an Mutable Class (Use setters)

	private double amt; // instance variable
	private int years; // "-----"
	private float rate; // "-----"
	
	public void setAmt(double amt) throws Exception {
		if(amt<5000)
			throw new Exception("Principle amount must be Rs 5000/- or more");
		this.amt = amt;
	}
	public void setYears(int years) throws Exception {
		if(years<0||years>30)
			throw new Exception("Time period must be between 0 and 30 years");
		this.years = years;
	}
	public void setRate(float rate) throws Exception {
		if(rate<0 || rate > 1)
			throw new Exception("Interest rate must be between 0 and 1");
		this.rate = rate;
	}
	
	public double calcSimple(){
		double si=(amt*years*rate);
		return si;
	}

	public double calcComp(){
		double ci=amt * Math.pow((1+rate), years);
		return ci;
	}
	
}
