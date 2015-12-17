package com.allcorp.model;

import com.allcorp.common.Constants;

public class Address {

	private String id;
	private String addressLineOne;
	private String addressLineTwo;
	private String zipCode;
	private String city;
	private Area area;
	private long distanceFromDestination ;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}


	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getWayPoint() {
		StringBuffer wayPoint = new StringBuffer();
		if (null != addressLineOne && !addressLineOne.isEmpty()){
			wayPoint.append(addressLineOne).append(Constants.COMMA);
		}
		if (null != addressLineTwo && !addressLineTwo.isEmpty()){
			wayPoint.append(addressLineTwo).append(Constants.COMMA);
		}
		if (null != city && !city.isEmpty()){
			wayPoint.append(city).append(Constants.COMMA);
		}
		if (null != zipCode && !zipCode.isEmpty()){
			wayPoint.append(zipCode);
		}
			return wayPoint.toString();
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	public long getDistanceFromDestination() {
		return distanceFromDestination;
	}


	public void setDistanceFromDestination(long distanceFromDestination) {
		this.distanceFromDestination = distanceFromDestination;
	}


}
