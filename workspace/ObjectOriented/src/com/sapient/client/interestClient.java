package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.interest;
import com.sapient.util.SapUtil;
public class interestClient {

	public static void main(String[] args) {
		interest obj =new interest();
		obj.amt=5000;
		obj.rate=2.5f;
		obj.years=3;
		double si=obj.calcSimple();
		double ci=obj.calcComp();
		System.out.println("Simple: "+ si);
		System.out.println("Compound: "+ ci );

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the amount");
		double p=scan.nextDouble();
		System.out.println("Enter the years");
		int n=scan.nextInt();
		System.out.println("Enter the rate");
		float r=scan.nextFloat();

		interest obj2 =new interest();
		obj2.amt=p;
		obj2.rate=r;
		obj2.years=n;
		double si2=obj2.calcSimple();
		double ci2=obj2.calcComp();
		System.out.println("Simple: "+ SapUtil.roundUp2Dec(si2));
		System.out.println("Compound: "+ SapUtil.roundUp2Dec(ci2));




	}

}
