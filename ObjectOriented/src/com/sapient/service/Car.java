package com.sapient.service;

public class Car {

	private int carId;
	private String carName;
	private double price;

	public Car(int carId) throws Exception {
		// super();
		System.out.println("one arg constructor");
		if (carId < 1000)
			throw new Exception("carId must be more than or = 1000");
		this.carId = carId;
	}

	public Car(int carId, String carName) throws Exception {
		// super();
		this(carId);
		System.out.println("Two arguments");
		// this.carId = carId;
		if (!carName.matches("[a-zA-Z]{3,10}"))
			throw new Exception("Car name must contain 3-10 alphabets");
		this.carName = carName;
	}

	public Car(int carId, String carName, double price) throws Exception {
		// super();
		this(carId, carName);
		System.out.println("Three arguements");
		if (price < 10000)
			throw new Exception("Car price must be greater than 1 Lakh");
		// this.carId = carId;
		// this.carName = carName;
		this.price = price;
	}

	public void display() {
		System.out.println(carId + " " + carName + " " + price);
	}

}

//Example of Encapsulation