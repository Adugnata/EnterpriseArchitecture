package edu.miu.bank.service;

import edu.miu.bank.domain.Account;
import edu.miu.bank.domain.Customer;
import edu.miu.bank.integration.EmailSender;
import edu.miu.bank.repositories.AccountRepository;
import edu.miu.bank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private EmailSender emailSender;
	
   @Transactional(propagation = Propagation.REQUIRED)
	public void createCustomerAndAccount(int customerId, String customerName, String emailAddress, String AccountNumber){
	   Account account = new Account(AccountNumber);
	   accountRepository.saveAccount(account);
	   Customer customer = new Customer(customerId, customerName);
	   customer.setAccount(account);
	   customerRepository.saveCustomer(customer);
	   emailSender.sendEmail(emailAddress, "Welcome " + customerName);
   }

}
