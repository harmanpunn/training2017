package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptIdDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Department ID");
		int did = scan.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select * from sap_emp where dept_id = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, did);

		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()){
			System.out.println("EID: " + rs.getInt("eid"));
			System.out.println("ENAME: " + rs.getString("ename"));
			System.out.println("SALARY: " + rs.getDouble("sal"));
			System.out.println("DEPT_ID: " + rs.getInt("dept_id"));
			System.out.println("DOJ: " + rs.getDate("doj"));
			System.out.println("------------------------------------------");
		}
		
		conn.close();

	}

}
