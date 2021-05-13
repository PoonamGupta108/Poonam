package com;

import java.io.Serializable;

public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int age;
private String location;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
}
