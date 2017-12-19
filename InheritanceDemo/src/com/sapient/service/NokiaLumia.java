	package com.sapient.service;

public class NokiaLumia extends Nokia1100 {
	
	public double price = 25000;

	public void captureImage() {
		//doConv();
		
		System.out.println("Capture Image");
	}

	public void browseNet() {
		System.out.println("Browse Net");
	}

	@Override
	public void doConv() {
		System.out.println("Do converse 4G");
	}
	
	public void doConv2g(){     //Previous version can also be used using super 
		super.doConv();
	} 

}
