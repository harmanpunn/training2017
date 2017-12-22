package com.sapient.exceptions;

import java.io.*;;

public class Demo3 {

	public static void main(String[] args) {

		String str = null;

		// automatic resource management
		try (BufferedReader br = new BufferedReader(new FileReader("sap.txt"))) {
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());

		}

	}

}
