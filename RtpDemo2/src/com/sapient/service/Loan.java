package com.sapient.service;

public class Loan extends Account {

	public Loan(int accId, String custName, double bal) {
		super(accId, custName, bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deposit(double amt) {
		String res = "Loan already cleared";
		double bal = 0;
		if(amt < 0)
			return "Amount cannot be negative";
		if (amt < getBal() && getBal() >= 0) {
			bal = getBal() - amt;
			setBal(bal);
			res = "Deposited";
		} else if (amt > bal && (bal - amt) < 0) {
			
				setBal(0);
			res = "Deposited";
		}
		return res;
	}

}
