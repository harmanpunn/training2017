package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest1;

public class Interest1Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double p = scan.nextDouble();
		System.out.println("Enter the years");
		int n = scan.nextInt();
		System.out.println("Enter the rate");
		float r = scan.nextFloat();

		Interest1 obj = new Interest1();
		try {
			obj.setAmt(p);
			obj.setRate(r);
			obj.setYears(n);

			double si2 = obj.calcSimple();
			double ci2 = obj.calcComp();
			System.out.println("Simple: " + si2);
			System.out.println("Compound: " + ci2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
	}
}
