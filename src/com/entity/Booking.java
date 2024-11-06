package com.entity;

public class Booking {

	private int user_id;
	private int pnr;
	private int tno;
	private String cno;
	private int seat;
	private String arrival;
	private String departure;
	private String journey_date;
	private String booking_date;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int user_id, int pnr, int tno, String cno, int seat, String arrival, String departure,
			String journey_date, String booking_date) {
		super();
		this.user_id = user_id;
		this.pnr = pnr;
		this.tno = tno;
		this.cno = cno;
		this.seat = seat;
		this.arrival = arrival;
		this.departure = departure;
		this.journey_date = journey_date;
		this.booking_date = booking_date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getJourney_date() {
		return journey_date;
	}
	public void setJourney_date(String journey_date) {
		this.journey_date = journey_date;
	}
	public String getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	@Override
	public String toString() {
		return "Booking [user_id=" + user_id + ", pnr=" + pnr + "]";
	}
}
