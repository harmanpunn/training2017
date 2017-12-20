package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SumAvgDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select SUM(sal) totsal, AVG(sal) avgsal, COUNT(eid) numofemp from sap_emp";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()){
			
			System.out.println("Sum: " + rs.getDouble("totsal"));
			System.out.println("Average: " + rs.getDouble("avgsal"));
			System.out.println("Count: " + rs.getInt("numofemp"));
			System.out.println("------------------------------------------");
		}
		
		conn.close();

	}

}
