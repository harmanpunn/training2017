package com.pack2;

public class Emp implements Comparable<Emp> {

	private int empId;
	private String empName;
	private double sal;

	public Emp(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {

		return empId + " " + empName + " " + sal;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.empId;
		Integer e2 = emp.empId;
		return e1.compareTo(e2);

	}

}
