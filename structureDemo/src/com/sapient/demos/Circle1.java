package com.sapient.demos;

import java.util.Scanner;

public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the radius");
	    double r=scan.nextDouble();
	    
	    double p = C_peri(r);
	    double a = C_area(r);
	    System.out.println("Circumference "+ p);
	    System.out.println("Area: "+ a);
	    scan.close();

	}
	
	public static double C_peri(double rad){
		double peri=2*Math.PI*rad;
		return peri;
	}
	
	public static double C_area(double rad){
		double area=Math.PI*rad*rad;
		return area;
	}
}
	
