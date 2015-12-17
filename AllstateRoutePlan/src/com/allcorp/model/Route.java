package com.allcorp.model;

import java.util.ArrayList;
import java.util.List;

public class Route {
	
	private String id ;
	private Cab cab;
	private List<Address> addressList;
	
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Address> getAddressList() {
		if(null!=addressList && addressList.size()>0)
		 return addressList;
		else 
			return new ArrayList<Address>();
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	

}
