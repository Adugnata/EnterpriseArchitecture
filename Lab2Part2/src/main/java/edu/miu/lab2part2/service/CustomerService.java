package edu.miu.lab2part2.service;

import edu.miu.lab2part2.domain.Address;
import edu.miu.lab2part2.domain.Customer;
import edu.miu.lab2part2.dao.ICustomerDAO;
import edu.miu.lab2part2.integration.IEmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
    ICustomerDAO customerDAO;
	@Autowired
	IEmailSender emailSender;

	public void addCustomer(String name, String email, String street,
			String city, String zip) {
		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);
		customer.setAddress(address);
		customerDAO.save(customer);
		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
	}
}
