package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.entity.Booking;
import com.entity.Passenger;
import com.utility.Utility;

public class Dao {

	PreparedStatement ps = null;
	ResultSet rs = null;
	Passenger p = null;

	public List<Passenger> getAllPassengers() {
		String query = "SELECT * FROM user";
//		String query1 = "SELECT * FROM booking";
		List<Passenger> l1 = new ArrayList<Passenger>();
		try {
			rs = Utility.createConnection(query).executeQuery();
			while (rs.next()) {
				int uid = rs.getInt("User_Id");
				String pname = rs.getString("Full_Name");
				int age = rs.getInt("Age");
				String sex = rs.getString("Sex");
				int adhar = rs.getInt("Adhar");
				String email = rs.getString("Email");
				String pass = rs.getString("Password");
				p = new Passenger(uid,pname,age,sex,adhar,email,pass);
				l1.add(p);
			}
			Utility.closeConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return l1;
	}

	public int insertPassengers(int uid, String nm, int age,String sex, int adhar,String email,
			String pass) {
		String query = "INSERT INTO user(User_Id,Full_Name,Age,Sex,Adhar,Email,Password)values(?,?,?,?,?,?,?);";
		int num = 0;
		try {
			ps = Utility.createConnection(query);
			ps.setInt(1, uid);
			ps.setString(2, nm);
			ps.setInt(3, age);
			ps.setString(4, sex);
			ps.setInt(5, adhar);
			ps.setString(6, email);
			ps.setString(7, pass);
			num = ps.executeUpdate();
			Utility.closeConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return num;
	}
	public List<Booking> getAllBookings() {
		String query = "SELECT * FROM booking";
		List<Booking> l1 = new ArrayList<Booking>();
		try {
			rs = Utility.createConnection(query).executeQuery();
			while(rs.next()) {
//				int b_No = rs.getInt("Booking_No");
				int uid = rs.getInt("User_Id");
				int pnr = rs.getInt("PNR");
				int tno = rs.getInt("Train_No");
				String cno = rs.getString("Coach_No");
				int seat = rs.getInt("Seat");
				String depar = rs.getString("Departure");
				String arrival = rs.getString("Arrival");
				String jdate = rs.getString("Journey_Date");
				String bdate = rs.getString("Booking_Date");
				Booking b1 = new Booking(uid,pnr,tno,cno,seat,arrival,depar,jdate,bdate);
				l1.add(b1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l1;	
	}
}
