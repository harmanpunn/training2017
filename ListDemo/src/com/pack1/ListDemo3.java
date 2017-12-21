package com.pack1;

import java.util.ArrayList;
import java.util.*;

public class ListDemo3 {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("birbal");
		lst.add("amar");
		lst.add("sam");
		Iterator<String> it = lst.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}		
		
	}

}
