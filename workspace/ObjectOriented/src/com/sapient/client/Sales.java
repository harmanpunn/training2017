package com.sapient.client;

import com.sapient.service.SalesPerson;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson s1 = new SalesPerson(1001, "Ram", 45000);
		SalesPerson s2 = new SalesPerson(1002, "Tom", 55000);
		SalesPerson s3 = new SalesPerson(1003, "Sam", 10000);
		s1.display();
		s2.display();
		s3.display();
		System.out.println("No. of persons: "+ SalesPerson.noOfPersons);
		System.out.println("Total Sales: "+ SalesPerson.tsales);
		
	
	}

}
