package com.bridgelabz.clinicmgmt.model;

public class Patient {

	private int id;
	private String name;
	private String mobileNo;
	private Address age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Address getAge() {
		return age;
	}

	public void setAge(Address age) {
		this.age = age;
	}

}
