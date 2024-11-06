package com.entity;

import java.util.List;

public class Passenger {

	private int user_id;
	private String full_name;
	private int age;
	private String sex;
	private int adhar;
	private String email;
	private String pass;
	private List<Booking> booking;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int user_id, String full_name, int age, String sex, int adhar, String email, String pass) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.age = age;
		this.sex = sex;
		this.adhar = adhar;
		this.email = email;
		this.pass = pass;
//		this.booking = booking;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAdhar() {
		return adhar;
	}

	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Passenger [user_id=" + user_id + ", full_name=" + full_name + "]";
	}
}
