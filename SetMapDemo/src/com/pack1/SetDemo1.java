package com.pack1;

import java.util.*;

public class SetDemo1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>(32,0.5f);
		set.add("ram");
		set.add("tom");
		set.add("peter");
		set.add("sam");
		set.add("amar");
		System.out.println(set.add("tom"));  //will return false ...because duplicates are ignored
		for (String str : set) {
			System.out.println(str);
		}
	}
}