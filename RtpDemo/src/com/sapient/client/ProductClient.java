package com.sapient.client;

import com.sapient.service.Computer;
import com.sapient.service.Mobile;
import com.sapient.service.Product;

public class ProductClient {

	public static void main(String[] args) {
		Product arr[] = new Product[4];
		arr[0] = new Computer(1001, "acer", 35000, "4tb");
		arr[1] = new Computer(1002, "hp", 20000, "2tb");
		arr[2] = new Mobile(1003, "samsung", 7000, "12MP");
		arr[3] = new Mobile(1004, "iphone", 35000, "16.2MP");

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%10s%10s%10s%20s%20s\n", "PID", "PNAME", "PRICE", "HDD", "CAMERA", "RANGE", "TYPE");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (Product prod : arr) {
			prod.display();
		}
		System.out.println("-----------------------------------------------------------------------------------------");

	}

}
