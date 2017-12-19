package com.sapient.client;

import com.sapient.service.Nokia1100;
import com.sapient.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nokia1100 mobile = new NokiaLumia();
		mobile.doConv();
		mobile.sendSms();
		//mobile.captureImage();
	//	mobile.browseNet();
		System.out.println(mobile.price);
		
		/*Nokia1100 mob = new NokiaLumia();
		mob.doConv();        //to prove that static method cannot be overridden. Compiler will rewrite it. 
						      // static methods can be called only using class name.					
*/	}

}
