package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmpDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		double sal = scan.nextDouble();
		System.out.println("Enter the EID: ");
		int eid = scan.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient123");
		String sql = "update sap_emp SET sal = ? where eid = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, sal);
		st.setInt(2, eid);
		int rows = st.executeUpdate();
		System.out.println(rows + " rows affected ");
		conn.close();
	}

}
