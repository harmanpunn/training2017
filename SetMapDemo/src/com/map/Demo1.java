package com.map;

import java.util.*;

import com.pack1.Emp;;

public class Demo1 {

	public static void main(String[] args) {

		Emp e1 = new Emp(1005, "ram", 35000);
		Emp e2 = new Emp(1003, "mohit", 48000);
		Emp e3 = new Emp(1007, "rahul", 27000);
		Map<Integer, Emp> map = new HashMap<Integer, Emp>();
		map.put(1005, e1);
		map.put(1003, e2);
		map.put(1007, e3);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int eid = scan.nextInt();

		if (map.containsKey(eid)) {
			Emp e = map.get(eid);
			System.out.println(e);
		} else {
			System.out.println("Not Found");
		}

	}

}
