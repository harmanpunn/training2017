package com.sapient.demos;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		BigInteger f = calcFac(n);
		System.out.println("Factorial: "+f );
		scan.close();
		
		
	}
	public static BigInteger calcFac(int num){
		
		BigInteger fact = BigInteger.ONE;
		int i;
		for(i=1;i<=num;i++)
			fact=fact.multiply(BigInteger.valueOf(i));
		return fact;
	}
}
