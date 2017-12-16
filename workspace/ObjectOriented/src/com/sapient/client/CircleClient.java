package com.sapient.client;

import com.sapient.service.Circle;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.radius=5;
		double cir=obj.calcCircum();
		double ar=obj.calcArea();
		System.out.println("Circumference "+ cir);
		System.out.println("Area "+ ar);

	
	}

}
