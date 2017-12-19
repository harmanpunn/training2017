package com.sapient.client;

import com.sapient.service.Agent;
import com.sapient.service.Atm;
import com.sapient.service.Bank;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm atm = Bank.getAtm();  //Client can only access atm functions
		atm.deposit();
		atm.withdraw();
		atm.getBal();
		
		Agent agent = Bank.getAgent();  //Client can only access agents functions
		agent.clearPdc();
		agent.approveLoan();
		
		// Bank bank = new Bank(); // Will give error as client cannot create instances
	}

}
