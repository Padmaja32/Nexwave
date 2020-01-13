package com.deloitte.seventhmvn.hibfifth.entity;

import javax.persistence.Entity;

@Entity
public class Student {
	int sid;
	String sname;
	String address;
	public Student() {
		super();
	}
	public Student(int sid, String sname, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}