package edu.miu.practice._1.service;

import edu.miu.practice._1.repo.CustomerRepo;
import edu.miu.practice._1.integration.IMessageSender;
import edu.miu.practice._1.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    IMessageSender messageSender;
    @Autowired
    CustomerRepo repo;
    @Override
    public void addCustomer(Customer customer) {
        repo.save(customer);
        messageSender.sendMessage(customer.getAddress(),"welcome" + " " + customer.getName());
    }
}
