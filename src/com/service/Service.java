package com.service;

import java.util.List;
import java.util.Scanner;

import com.dao.Dao;
import com.entity.Passenger;

public class Service {

	Dao dao = null;
	Scanner sc = new Scanner(System.in);
	public List<Passenger> getAllPassengers(){
		dao = new Dao();
		return dao.getAllPassengers();
	}
	public int insertPassenger(int n) {
		int num = 0;
		dao = new Dao();
		while(n>0) {
			System.out.print("Enter PNR Number : ");
			int pnr = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Adhar : ");
			int adhar = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Train Number : ");
			int tnum = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Coach Number : ");
			String coach = sc.nextLine();
			System.out.print("Enter seat number ");
			int seat = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter From : ");
			String from = sc.nextLine();
			System.out.print("Enter To : ");
			String to = sc.nextLine();
			num = dao.insertPassengers(pnr, name, age, adhar, tnum, coach, seat, from, to);
			n--;
		}
		return num;
	}
}
