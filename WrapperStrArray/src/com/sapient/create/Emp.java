package com.sapient.create;

public class Emp {

	static {
		System.out.println("I am in static block");
	}

	public Emp() {
		System.out.println("emp constuctor");
	}

	public void dispplay() {
		System.out.println("Instance Method Display");
	}
}
