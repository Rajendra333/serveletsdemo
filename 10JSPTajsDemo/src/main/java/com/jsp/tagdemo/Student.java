package com.jsp.tagdemo;

public class Student {
	
	
	private String firstname;
	private String lastname;
	private boolean above90percent;
	
	public Student(String firstname, String lastname, boolean above90) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.above90percent = above90;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public boolean isAbove90percent() {
		return above90percent;
	}
	public void setAbove90percent(boolean above90percent) {
		this.above90percent = above90percent;
	}

}
