package com.entity;

public class Passenger {

	private int pnr;
	private int train_num;
	private String coach;
	private int seat_num;
	private String p_name;
	private int age;
	private int adhar;
	private String from;
	private String to;
	private String booking_date;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Passenger(int pnr, int train_num, String coach, int seat_num, String p_name, int age, int adhar,
			String from, String to, String booking_date) {
		super();
		this.pnr = pnr;
		this.train_num = train_num;
		this.coach = coach;
		this.seat_num = seat_num;
		this.p_name = p_name;
		this.age = age;
		this.adhar = adhar;
		this.from = from;
		this.to = to;
		this.booking_date = booking_date;
	}

	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getTrain_num() {
		return train_num;
	}
	public void setTrain_num(int train_num) {
		this.train_num = train_num;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public int getSeat_num() {
		return seat_num;
	}
	public void setSeat_num(int seat_num) {
		this.seat_num = seat_num;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAdhar() {
		return adhar;
	}
	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	@Override
	public String toString() {
		return "Passenger [pnr=" + pnr + ", p_name=" + p_name + ", from=" + from + ", to=" + to + "]";
	}
}
