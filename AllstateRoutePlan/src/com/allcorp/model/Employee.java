package com.allcorp.model;

public class Employee extends Person{

	private String gender;
	private String ntid ;
	private Address address;
	private Route route;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNtid() {
		return ntid;
	}
	public void setNtid(String ntid) {
		this.ntid = ntid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
}
