package com.capgemini.ebs.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.client.RestTemplate;

public class TestDB {
	public static void main(String args[]) {
		s2sCall();
		//dbConnectionTest();
	}
	public static void s2sCall() {
		final String uri = "http://localhost:8081/ebs/welcome";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println("RESULT OF S2S CALL : "+result);
	}
	public static void dbConnectionTest() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String driver = "com.mysql.jdbc.Driver",
				url = "jdbc:mysql://localhost:3306/ebs_sys",
				username = "ebs_user",
				password = "ebs@123";
		String query = "select * from test";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			// here sonoo is database name, root is username and password
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" "+rs.getString(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
