package com.sapient.service;

public class Savings extends Account {

	
	
	public Savings(int accId, String custName, double bal) {
		super(accId, custName, bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deposit(double amt) {
		double bal = getBal() + amt;
		String res = "Not deposited";
		if(amt < 0)
			return "Amount cannot be negative";
		if(amt<50000){
			setBal(bal);
			res = "Sucessfully deposited";
		}
		return res;
	}

	

}
