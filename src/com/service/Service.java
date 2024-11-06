package com.service;

import java.util.List;
import java.util.Scanner;

import com.dao.Dao;
import com.entity.Booking;
import com.entity.Passenger;

public class Service {

	Dao dao = null;
	Scanner sc = new Scanner(System.in);

	public List<Passenger> getAllPassengers() {
		dao = new Dao();
		return dao.getAllPassengers();
	}

	public int insertPassenger(int n) {
		int num = 0;
		dao = new Dao();
		while (n > 0) {
			System.out.print("Enter User Id : ");
			int uid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Full Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Sex : ");
			String sex = sc.nextLine();
			System.out.print("Enter Adhar : ");
			int adhar = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Email Id : ");
			String email = sc.nextLine();
			System.out.print("Enter Password : ");
			String pass = sc.nextLine();
			num = dao.insertPassengers(uid,name,age,sex,adhar,email,pass);
			n--;
		}
		return num;
	}
	public boolean login(int uid,String pass) {
		List<Passenger> l1 = this.getAllPassengers();
		for (Passenger p : l1) {
			if(p.getUser_id()==uid && p.getPass().equals(pass)) {
				return true;
			}
		}
		return false;
	}
	public List<Booking> getAllBookings(){
		return new Dao().getAllBookings();
	}
}
