package com.client;

import java.util.List;
import com.controller.Controller;
import com.entity.Passenger;

public class Client {

	public static void main(String[] args) {
		Controller control = new Controller();
//		control.insertPassengers(1);
//		List<Passenger> l1 = control.getAllPassengers();
//		System.out.printf("%-10s%-25s%-10s\n","User Id","Passenger Name","Age");
//		System.out.println("------------------------------------------------");
//		for (Passenger ps : l1) {
//			System.out.printf("%-10s%-25s%-10s\n",ps.getUser_id(),ps.getFull_name(),ps.getAge());
//		}
//		System.out.println(control.login(54321, "12345"));
		System.out.println(control.getAllBookings());
	}
}
