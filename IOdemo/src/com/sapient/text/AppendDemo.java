package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args) throws IOException {


		FileWriter fw = new FileWriter("sap.txt", true);   //by default "true" is false 
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("christmas is celebrated in sapient lobby\n");
		bw.write("assessment is on 4-Jan-2018\n");
		bw.close();
		fw.close();
		System.out.println("File Appended");

	}

}
