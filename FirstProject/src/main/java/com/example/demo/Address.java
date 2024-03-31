package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Prototype pattern
@Component
@Scope(value="prototype")
public class Address {

	String area;

	public Address() {
		System.out.println("Contructor of address got called.");
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + "]";
	}
	
	public String display() {
		return "Hey there";
	}
}
