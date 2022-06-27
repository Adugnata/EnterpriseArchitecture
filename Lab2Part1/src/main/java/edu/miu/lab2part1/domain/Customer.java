package edu.miu.lab2part1.domain;

import lombok.Data;

@Data
public class Customer {
	private String name;
	private String email;
	private Address address;
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

}
