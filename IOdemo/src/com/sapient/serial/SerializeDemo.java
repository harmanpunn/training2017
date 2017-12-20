package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * Scanner scan = new Scanner(System.in); System.out.println(
		 * "Enter employee ID "); int eid = scan.nextInt(); System.out.println(
		 * "Enter Employee Name"); String name = scan.next();
		 * System.out.println("Enter the salary"); double sal =
		 * scan.nextDouble();
		 */

		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutput oos = new ObjectOutputStream(fos);
		Emp emp1 = new Emp(1001, "ram", 60000);
		Emp emp2 = new Emp(1002, "tom", 35000);
		Emp emp3 = new Emp(1003, "peter", 55000);
		oos.writeObject(emp1); // sends object to file
		oos.writeObject(emp2);
		oos.writeObject(emp3);
		oos.close();
		fos.close();
		System.out.println("Serialized");

	}

}
