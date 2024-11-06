package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Utility {

	private static String path = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/ticketsystem";
	private static String user = "root";
	private static String pass = "root";
	private static Connection con = null;
	private static PreparedStatement ps;

	private Utility() {
	}

	public static PreparedStatement createConnection(String query) {
		try {
			Class.forName(path);
//			System.out.println(1);
			con = DriverManager.getConnection(url, user, pass);
//			System.out.println(2);
			ps = con.prepareStatement(query);
//			System.out.println(3);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return ps;
	}

	public static void closeConnection() {
		try {
			if (con != null && ps != null) {
				con.close();
				ps.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
