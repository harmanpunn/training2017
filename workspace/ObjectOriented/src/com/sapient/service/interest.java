package com.sapient.service;

public class interest {

	public double amt;  // instance variable 
	public int years;   // "-----"
	public float rate;  // "-----"

	//public static double amt;  // This will become static 

	public double calcSimple(){
		double si=(amt*years*rate)/100;
		return si;
	}

	public double calcComp(){
		double ci=amt * Math.pow((1+rate/100), years);
		return ci;
	}

	/* public static double calcComp(){
		double ci=amt * Math.pow((1+rate/100), years);
		return ci;
	} */ 
   // Static methods cannot access instance members directly
}
