package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {

		//manual boxing and unboxing
		Integer a = new Integer(10);  // boxing
		Integer b = new Integer(20);  //boxing
		
		int res = a.intValue() + b.intValue();  // unboxing
		Integer c = Integer.valueOf(res);  //boxing
		
		System.out.println(c);
		
		int v1 = 10;
		Integer wrap = v1;  //will give error in versions below jdk1.4

	}

}
