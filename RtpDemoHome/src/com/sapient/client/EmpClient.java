package com.sapient.client;


import com.sapient.service.Employee;
import com.sapient.service.Professor;
import com.sapient.service.Trainee;


public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee arr[] = new Employee[5];
		arr[0] = new Trainee(1001, "Rama", 95);
		arr[1] = new Trainee(1002, "Shyam", 86);
		arr[2] = new Professor(1003, "Mohit", 8);
		arr[3] = new Professor(1004, "Janit", 4);
		arr[4] = new Trainee(1005, "Rohan", 89.9f);
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%20s%20s%30s\n","EID", "ENAME", "PERCENT/RATING", "RATING", "TYPE");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for (Employee obj : arr) {
			obj.display();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}

}
