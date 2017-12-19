package com.sapient.client;

public class Area {
	// static methods can also be overloaded
	public static int calcArea(int side) {
		System.out.println("int Arg");
		return side * side;
	}

	public static double calcArea(double side) {
		System.out.println("Double Arg");
		return side * side;
	}

	public static int calcArea(int l, int b) {
		System.out.println("Different sides");
		return l * b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcArea(5));
		System.out.println(calcArea(10.2));
		System.out.println(calcArea(5, 4));
	}

}
