package com.sapient.service;

public interface Basic {
	/* int age = 78; // global constant ....
	// in interface only static final variables can be declared. ie value has to
	 be assigned. */
	String convert2Binary(int num);

	public default int doSum(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; ++i)
			sum = sum + a[i];
		return sum;
	}

	public default double doAvg(int... a) {
		int sum = doSum(a);
		double avg = sum / a.length;
		return avg;
	}

	public static void display() {

	}

}
