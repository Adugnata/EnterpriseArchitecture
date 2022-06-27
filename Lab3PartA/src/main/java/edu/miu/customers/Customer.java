package edu.miu.customers;

import lombok.Data;

@Data
public class Customer {
	private int customerNumber;
	private String name;
	private String email;
	private String phone;
	private CreditCard creditCard;

	public Customer(int customerNumber, String name, String email, String phone) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

}
