package com.controller;

import java.util.List;
import com.entity.Booking;
import com.entity.Passenger;
import com.service.Service;

public class Controller {

	Service service = null;

	public List<Passenger> getAllPassengers() {
		service = new Service();
		return service.getAllPassengers();
	}

	public int insertPassengers(int n) {
		service = new Service();
		return service.insertPassenger(n);
	}
	public boolean login(int uid,String pass) {
		return new Service().login(uid, pass);
	}
	public List<Booking> getAllBookings(){
		return new Service().getAllBookings();
	}
}
