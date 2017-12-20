package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest obj = Calculator.getInterest();
		System.out.println(obj.calcSimple(5000, 2, 2.5f));
		System.out.println(obj.calcCompound(5000, 2, 2.5f));
		System.out.println(obj.convert2Binary(20));
		System.out.println(obj.doSum(6,8,1,2,20));
		System.out.println(obj.doAvg(6,8,1,2,20));
		

	}

}
