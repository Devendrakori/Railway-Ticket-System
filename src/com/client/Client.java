package com.client;

import java.util.List;

import com.controller.Controller;
import com.entity.Passenger;

public class Client {

	public static void main(String[] args) {
		Controller control = new Controller();
		control.insertPassengers(1);
//		List<Passenger> l1 = control.getAllPassengers();
//		for (Passenger ps : l1) {
//			System.out.println(ps);
//		}
	}
}
