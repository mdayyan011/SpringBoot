package com.web.app;

public class UserDetails {

	private String name;
	private double age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", age=" + age + "]";
	}
	
}
