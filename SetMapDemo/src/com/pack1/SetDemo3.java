package com.pack1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {

		Emp e1 = new Emp(1005, "ram", 35000);
		Emp e2 = new Emp(1003, "mohit", 48000);
		Emp e3 = new Emp(1007, "rahul", 27000);
		Emp e4 = new Emp(1001, "tom", 55000);
		Emp e5 = new Emp(1004, "sam", 53000);
		Emp e6 = new Emp(1005, "ram", 35000);

		Emp e7 = e2;
		Set<Emp> set = new TreeSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);  //ignored based on the content (overridden hashcode() and equals()) 
		set.add(e7);  //ignored based on reference
		
		for (Emp emp : set) {
			System.out.println(emp);
		}


	}

}
