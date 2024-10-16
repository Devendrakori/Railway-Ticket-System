package com.controller;

import java.util.List;
import com.entity.Passenger;
import com.service.Service;

public class Controller {

	Service service = null;
	public List<Passenger> getAllPassengers(){
		service = new Service();
		return service.getAllPassengers();
	}
	public int insertPassengers(int n) {
		service = new Service();
		return service.insertPassenger(n);		
	}
}
