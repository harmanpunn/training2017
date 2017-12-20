package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpDeptNameDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Department Name");
		String dname = scan.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "SELECT e.eid, e.ename, e.sal, d.dname FROM sap_emp e INNER JOIN sap_dept d ON d.did=e.dept_id where d.dname = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, dname);

		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()){
			System.out.println("EID: " + rs.getInt("eid"));
			System.out.println("ENAME: " + rs.getString("ename"));
			System.out.println("SALARY: " + rs.getDouble("sal"));
			System.out.println("DEPT NAME: " + rs.getString("dname"));			
			System.out.println("------------------------------------------");
		}
		
		conn.close();

	}

}
