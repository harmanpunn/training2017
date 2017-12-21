package com.sapient.arr;

import java.util.Arrays;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		// array is also an object in java. Therefore object class members are
		// inherited to an array
		String arr[] = new String[4];
		arr[0] = "ram";
		arr[1] = "anand";
		arr[2] = "vikas";
		arr[3] = "peter";
		
		System.out.println("Ascending order");
		Arrays.sort(arr);
		// advanced for loop ... only for iterations and collections
		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println("Descending order");
		Arrays.sort(arr, Collections.reverseOrder());
		for (String str : arr) {
			System.out.println(str);
		}

	}

}
