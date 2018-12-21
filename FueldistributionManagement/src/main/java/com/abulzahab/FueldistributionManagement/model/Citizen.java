package com.abulzahab.FueldistributionManagement.model;

import java.util.List;

public class Citizen extends User {

	private String identityNo;
	private String address;
	//private List<FuelRequest> fuelRequests;
	
	public String getIdentityNo() {
		return identityNo;
	}
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
