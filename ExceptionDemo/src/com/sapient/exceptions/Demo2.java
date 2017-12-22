package com.sapient.exceptions;

public class Demo2 {

	public static void main(String[] args) {

		System.out.println(approveLoan(18, 500000));

	}

	public static String approveLoan(int age, double income) {
		String res = null;
		try {
			res = processLoan(age, income);
			return res;   //it will check whether finally block is present. Executes finally block fist
		} catch (AgeException | IncomeException e) {
			return e.getMessage();
		} finally {
			System.out.println("Finally Block");
		}

	}

	public static String processLoan(int age, double income) throws AgeException, IncomeException {
		if (age < 20 || age > 40)
			throw new AgeException("Age must be between 20 and 40");
		if (income < 400000)
			throw new IncomeException("Income must be minimum 4 Lakhs");
		return "Loan Approved";

	}

}
