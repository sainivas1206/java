package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	

	private static final long serialVersionUID = 4112103690512225915L;

	private int id;
	
	private String name;
	
	transient private String grp;

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

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grp=" + grp + "]";
	}
}
