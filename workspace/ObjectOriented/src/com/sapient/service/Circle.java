package com.sapient.service;

public class Circle {

	public double radius;

	public double calcCircum(){
		double circum=2*Math.PI*radius;
		return circum;	
	}

	public double calcArea(){
		double area=Math.PI*radius*radius;
		return area;	
	}

}
