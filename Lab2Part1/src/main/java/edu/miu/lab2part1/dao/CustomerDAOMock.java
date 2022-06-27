package edu.miu.lab2part1.dao;

import edu.miu.lab2part1.domain.Customer;
import edu.miu.lab2part1.integration.ILogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("two")
public class CustomerDAOMock implements ICustomerDAO {
	@Autowired
	private ILogger logger;
	
	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
	}

}
