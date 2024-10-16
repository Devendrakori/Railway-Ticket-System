package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.entity.Passenger;
import com.utility.Utility;

public class Dao {

	PreparedStatement ps = null;
	ResultSet rs = null;
	Passenger p = null;

	public List<Passenger> getAllPassengers() {
		String query = "SELECT * FROM passengers";
		List<Passenger> l1 = new ArrayList<Passenger>();
		try {
			rs = Utility.createConnection(query).executeQuery();
			while (rs.next()) {
				int pnr = rs.getInt("PNR");
				String pname = rs.getString("P_Name");
				int age = rs.getInt("Age");
				int adhar = rs.getInt("Adhar");
				int tno = rs.getInt("Train_nu");
				String coach = rs.getString("Coach_nu");
				int seat = rs.getInt("Seat");
				String from = rs.getString("Departure");
				String to = rs.getString("Arrival");
				String date = rs.getString("Booking_date");
				p = new Passenger(pnr, tno, coach, seat, pname, age, adhar, from, to, date);
				l1.add(p);
			}
			Utility.closeConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return l1;
	}
	public int insertPassengers(int prn,String nm,int age,int adhar,int tno,String coach,int seat,String from,String to) {
		String query = "INSERT INTO passengers(PNR,P_Name,Age,Adhar,Train_nu,Coach_nu,Seat,Departure,Arrival)values(?,?,?,?,?,?,?,?,?);";
		int num = 0;
		try {
			ps = Utility.createConnection(query);
			ps.setInt(1, prn);
			ps.setString(2, nm);
			ps.setInt(3, age);
			ps.setInt(4, adhar);
			ps.setInt(5, tno);
			ps.setString(6, coach);
			ps.setInt(7, seat);
			ps.setString(8, from);
			ps.setString(9, to);
			num = ps.executeUpdate();
			Utility.closeConnection();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return num;
	}
}
