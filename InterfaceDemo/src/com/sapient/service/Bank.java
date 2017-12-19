package com.sapient.service;

public class Bank implements Atm, Agent {

	private static Bank bank = new Bank();

	private Bank() {

	}

	public static Atm getAtm() {   // So that client cannot create instances
		Atm atm = bank; 
		return atm;
	}

	public static Agent getAgent() {
		Agent agent = bank;
		return agent;
	}

	@Override
	public void clearPdc() {
		// TODO Auto-generated method stub
		System.out.println("Clear pdc");

	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Approve loan");

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit");

	}

	@Override
	public void getBal() {
		// TODO Auto-generated method stub
		System.out.println("Get Balance");

	}

}
