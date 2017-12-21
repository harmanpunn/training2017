package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("birbal");
		lst.add("amar");
		lst.add("sam");
		System.out.println("Iterating in forward");
		ListIterator<String> it = lst.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Iterating in reverse");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
	}
	}
}
