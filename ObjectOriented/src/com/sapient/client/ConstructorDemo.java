package com.sapient.client;

import com.sapient.service.Car;

public class ConstructorDemo {

	public static void main(String[] args) throws Exception {
		
		// Car car0 = new Car(1001);
		// Car car1 = new Car(1001,"ford");
		try {
			Car car = new Car(1001, "Ford", 5000);
			car.display();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Car.carId = 1002; //This will give error as carId is private
	}

}
