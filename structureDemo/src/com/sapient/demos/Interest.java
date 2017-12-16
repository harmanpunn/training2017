package com.sapient.demos;
import java.util.*;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Enter the amount");
	    double p=scan.nextDouble();
	    System.out.println("Enter the years");
	    int n=scan.nextInt();
	    System.out.println("Enter the rate");
	    float r=scan.nextFloat();
	    
	    double simple = calcSimple(p,n,r);
	    double compound = calcCompound(p,n,r);
	    
	    System.out.println("Simple Interest: "+ simple);
	    System.out.println("Compound Interest: "+ compound);
	    scan.close();
	}
	
	public static double calcSimple(double amt, int years, float rate){
		double si= (amt*years*rate)/100; 
		return si;
	}
	
	public static double calcCompound(double amt, int years, float rate){
		double ci=amt* Math.pow((1+rate/100),years);
		return ci;
	}
}
