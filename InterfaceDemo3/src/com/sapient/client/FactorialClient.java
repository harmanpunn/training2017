package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = Calculator.getFactorial();
		System.out.println("Factorial: " + obj.findFact(5));
		System.out.println("Sum: " + obj.doSum(7,9,2,6,9));

	}

}
