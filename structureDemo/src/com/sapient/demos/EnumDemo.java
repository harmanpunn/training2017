package com.sapient.demos;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int v1 = scan.nextInt();
		System.out.println("Enter second value");
		int v2 = scan.nextInt();
		System.out.println("Choose\n 1 -- Add \n 2 -- Subtract \n 3 -- Multiply\n");
		String str = scan.next();
		
		try {
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch (menu) {
			case ADD:
				System.out.println("Add " + (v1 + v2));
				break;
			case SUB:
				System.out.println("Subtract " + (v1 - v2));
				break;
			case MULTIPLY:
				System.out.println("Multiply " + (v1 * v2));
				break;

			}

		} catch (Exception ex) {
			System.out.println("invalid option");
		}

	}
}

enum Menu {
	ADD, SUB, MULTIPLY
}