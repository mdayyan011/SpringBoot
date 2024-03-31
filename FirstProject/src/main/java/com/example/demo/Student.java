package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//In order to make this class a bean we have to use @Component annotation
// Singleton pattern
@Component
public class Student {

	String name;
	int roll;
	
	@Autowired
	Address address;
	
	public Student() {
		System.out.println("Constructor of student called.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	//Following will give exception if we dont autowire Address because Student class won't be able to find the address 
	//bean
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address.display() + "]";
	}
	
	 
	
}
