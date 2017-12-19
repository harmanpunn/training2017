package com.sapient.service;

public class Mobile extends Product {

	private String camera;

	public Mobile(int prodId, String prodName, double price, String camera) {
		super(prodId, prodName, price);
		this.camera = camera;
	}

	@Override
	public String isExpensive() {
		double price = getPrice();
		String res = null;
		if (price >= 10000)
			res = "expensive";
		else if (price >= 5000)
			res = "average";
		else
			res = "cheap";
		return res;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%20s%20s%20s\n", camera, isExpensive(), getClass().getSimpleName());
	}
	
	
	
}
