package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmpDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient123");
		String sql = "insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Employee Id: ");
		int eid = scan.nextInt();
		System.out.print("Enter Employee Name: ");
		String ename = scan.next();
		System.out.print("Enter Employee Salary: ");
		double sal = scan.nextDouble();
		System.out.print("Enter Employee Dept ID:  ");
		int depid = scan.nextInt();
		System.out.print("Enter Employee DOJ:  ");
		String doj = scan.next();

		st.setInt(1, eid);
		st.setString(2, ename);
		st.setDouble(3, sal);
		st.setInt(4, depid);
		st.setString(5, doj);
		int rows = st.executeUpdate();
		System.out.println(rows + " rows affected ");
		conn.close();
	}

}
