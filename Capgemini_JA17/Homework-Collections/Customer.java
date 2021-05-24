package com.capgemini.collectionexample;

public class Customer {

	private int cid;
	private String custname;
	private int age;
	private String dob;
	private String email;
	private String mobNo;
	
	public Customer(){
		super();
	}
	
	public Customer(int cid, String custname, int age, String dob, String email, String mobNo) {
		super();
		this.cid = cid;
		this.custname = custname;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.mobNo = mobNo;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
	
}
