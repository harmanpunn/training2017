package com.sapient.service;

public class interest {

	private double amt; // instance variable
	private int years; // "-----"
	private float rate; // "-----"

	public interest(double amt) throws Exception {
		super();
		if(amt<5000)
			throw new Exception("Principle amount must be Rs 5000/- or more");
		this.amt = amt;
	}

	public interest(double amt, float rate) throws Exception {
		//super();
		this(amt);
		if(rate<0 || rate > 1)
			throw new Exception("Interest rate must be between 0 and 1");
		this.rate = rate;
		
	}

	public interest(double amt, int years, float rate) throws Exception {
		//super();
		this(amt, rate);
		if(years<0||years>30)
			throw new Exception("Time period must be between 0 and 30 years");
		this.years = years;
	}
	
	public double calcSimple(){
		double si=(amt*years*rate)/100;
		return si;
	}

	public double calcComp(){
		double ci=amt * Math.pow((1+rate/100), years);
		return ci;
	}

}//Immutable Class