package com.sapient.jdbc;

import java.sql.*;


public class ViewAll {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select * from sap_emp";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		System.out.printf("%s%10s%10s%10s%10s", "EID", "ENAME", "SALARY", "DEPT_ID", "DOJ\n" );
		while(rs.next()){
			System.out.print(rs.getInt("eid") + "    ");
			System.out.print(rs.getString("ename") + "        ");
			System.out.print(rs.getDouble("sal") + " ");
			System.out.print(rs.getInt("dept_id") + " ");
			System.out.println(rs.getDate("doj") + " ");
			System.out.println("------------------------------------------");
		}
		
		conn.close();
		
		
	}

}
