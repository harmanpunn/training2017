package com.sapient.client;

import com.sapient.service.ContractEmp;
import com.sapient.service.Employee;
import com.sapient.service.OnrollEmp;


public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee arr[] = new Employee[5];
		arr[0] = new OnrollEmp(1001, "Rama", 25000);
		arr[1] = new OnrollEmp(1002, "Shyam", 20000);
		arr[2] = new ContractEmp(1003, "Mohit", 5000, 60);
		arr[3] = new ContractEmp(1004, "Janit", 6500, 70);
		arr[4] = new OnrollEmp(1005, "Rohan", 22000);

		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%10s%10s%10s%10s%20s%20s\n","EID", "ENAME", "SALARY", "DA", "PF", "DAYS", "NET SALARY", "TYPE");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for (Employee obj : arr) {
			obj.display();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");

	}

}
