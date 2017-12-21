package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		String arr[] = {"ram","amit","tom","peter","birbal"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));  // prints all elements in an array
		System.out.println("Length: " + arr.length);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to search");
		String str = scan.next();
		int res = Arrays.binarySearch(arr, str);
		if(res >= 0)
			System.out.println("Found at index: " + res);
		else 
			System.out.println("Not found");
		
		

	}

}
