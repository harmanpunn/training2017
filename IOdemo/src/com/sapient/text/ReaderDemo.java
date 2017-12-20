package com.sapient.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("sap.txt");
		BufferedReader br = new BufferedReader(fr, 2 * 1024 * 1024);
		//BufferedReader br = new BufferedReader(fr, Buffer size);
		
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

		br.close();
		fr.close();
	}

}
