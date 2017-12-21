package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		Emp e1 = new Emp(1005, "ram", 35000);
		Emp e2 = new Emp(1003, "mohit", 48000);
		Emp e3 = new Emp(1007, "rahul", 27000);
		Emp e4 = new Emp(1001, "tom", 55000);
		Emp e5 = new Emp(1004, "sam", 53000);

		List<Emp> lst = new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		Collections.sort(lst); // will give an error if Comparable is not implemented in Emp.java
								
		System.out.println("Sort on Employee ID---------------------");
		for (Emp emp : lst)
			System.out.println(emp);
		
		Collections.sort(lst,new NameComparator());  // whichever parameter we pass, it will sort based on that parameter
		System.out.println("Sort on Name----------------------------");
		for (Emp emp : lst) 
			System.out.println(emp);

		Collections.sort(lst,new SalComparator());  // whichever parameter we pass, it will sort based on that parameter
		System.out.println("Sort on Salary--------------------------");
		for (Emp emp : lst)
			System.out.println(emp);
	}

}
