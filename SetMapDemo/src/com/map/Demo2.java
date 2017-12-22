package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
import com.pack1.Emp;

public class Demo2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2005, "vikas");
		map.put(2008, "rahul");
		map.put(2010, "puneet");
		map.put(3003, "kashish");
		map.put(1005, "ram");
		map.put(1003, "sam");
		map.put(1007, "tom");
		map.put(1008, "rohan");
		map.put(1002, "tommy");
		map.put(1003, "janit"); // replace the duplicates
		map.put(null, "yolo");  // HashMap can have null key. Hashtable cannot have null key.
		map.put(3008, "teja");
		map.put(3007, "tejasva");

		System.out.println("Iterating using keySet()");
		Set<Integer> set = map.keySet();
		for (Integer key : set) {
			System.out.println(key + " " + map.get(key));
		}

		System.out.println("Iterating using values()");
		Collection<String> col = map.values();
		for (String str : col) {
			System.out.println(str);
		}

		System.out.println("Iterating using entry set");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry e : entries) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
