package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();

		try {
			Mtable obj = new Mtable(n);
			obj.display(8,4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		scan.close();

	}

}
