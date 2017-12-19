package com.sapient.service;

public class Circle {

	private double radius;

	public Circle(double radius) throws Exception {
		super();
		if (radius <= 0)
			throw new Exception("Radius should be greater than zero");
		this.radius = radius;
	}

	public double calcCircum() {
		double circum = 2 * Math.PI * radius;
		return circum;
	}

	public double calcArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

}
