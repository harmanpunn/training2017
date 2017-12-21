package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;
import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpClient {

	static Scanner scan = new Scanner(System.in);
	static IDao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		String strmenu = null;
		String opt = null;
		Menu emenu = null;
		do {
			System.out.println("Choose:\nADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\n");
			strmenu = scan.next();
			try {
				emenu = Menu.valueOf(strmenu);
				processMenu(emenu);
			} catch (Exception ex) {
				System.out.println("Invalid Menu Option");
			}

			System.out.println("Press y to continue");
			opt = scan.next();
		} while (opt.equals("y") || opt.equals("Y"));

	}

	public static void processMenu(Menu menu) {
		switch (menu) {
		case VIEWALL:
			viewall();
			break;
		case ADD:
			add();
			break;
		case VIEW:
			view();
			break;
		case EDIT:
			edit();
			break;
		case REMOVE:
			remove();
			break;

		}
	}

	private static void remove() {

	}

	private static void view() {
		System.out.println("Enter the ID: ");
		int id = scan.nextInt();
		Emp lst;
		try {
			lst = dao.viewEmployee(id);
			System.out.println(lst);
		} catch (NotFoundException e) {

			System.out.println(e.getMessage());
		}

	}

	private static void edit() {

	}

	private static void add() {
		System.out.print("Enter Employee ID: ");
		int id = scan.nextInt();
		System.out.print("Enter Employee Name: ");
		String ename = scan.next();
		System.out.print("Enter Employee Salary: ");
		double sal = scan.nextDouble();
		System.out.print("Enter Employee Dept ID: ");
		int deptId = scan.nextInt();
		System.out.print("Enter Employee Joining Date (dd-MM-yyyy): ");
		String date = scan.next();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj = LocalDate.parse(date, df);

		Emp emp = new Emp(id, ename, sal, deptId, doj);
		try {
			int a = dao.addEmployee(emp);
			System.out.println("Employee Added");
		} catch (IdException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	public static void viewall() {
		List<Emp> lst = dao.viewEmployee();
		for (Emp emp : lst)
			System.out.println(emp);
	}

}
