package com.sapient.service;

public class SalesPerson {

	public int id;
	public String name;
	public double samt;
	public static int noOfPersons;
	public static double tsales;

	public SalesPerson(int id, String name, double samt) {
		super();
		this.id = id;
		this.name = name;
		this.samt = samt;
		++noOfPersons;
		tsales = tsales + this.samt;
	}

	public double calcSalesComm() {
		double sc = 0;
		if (samt >= 50000)
			sc = 0.1 * samt;
		else if (samt >= 20000 && samt < 50000)
			sc = 0.05 * samt;
		else
			sc = 0.03 * samt;
		return sc;

	}

	public void display() {
		System.out.println(
				"Emp ID: " + id + " | Name: " + name + " | Sales: " + samt + " | Commission: " + calcSalesComm());
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
	}
}
