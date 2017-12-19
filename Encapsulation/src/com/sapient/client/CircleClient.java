package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;

public class CircleClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your radius");
		double rad = scan.nextDouble();

		try {
			Circle obj = new Circle(rad);
			double cir = obj.calcCircum();
			double ar = obj.calcArea();
			System.out.println("Circumference " + cir);
			System.out.println("Area " + ar);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
