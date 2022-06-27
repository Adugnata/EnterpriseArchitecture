package edu.miu.bank.service;

import edu.miu.bank.domain.Account;
import edu.miu.bank.domain.Customer;
import edu.miu.bank.domain.TraceRecord;
import edu.miu.bank.integration.EmailSender;
import edu.miu.bank.repositories.AccountRepository;
import edu.miu.bank.repositories.CustomerRepository;
import edu.miu.bank.repositories.TraceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;


@Service
public class BankService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private EmailSender emailSender;
	@Autowired
	private TraceRecordRepository recordRepository;
   @Transactional(propagation = Propagation.REQUIRED)
	public void createCustomerAndAccount(int customerId, String customerName, String emailAddress, String AccountNumber){
	  try {
		  Account account = new Account(AccountNumber);
		  accountRepository.saveAccount(account);
		  Customer customer = new Customer(customerId, customerName);
		  customer.setAccount(account);
		  customerRepository.saveCustomer(customer);
		  emailSender.sendEmail(emailAddress, "Welcome " + customerName);
		  recordRepository.SaveTraceRecord(new TraceRecord(new Date(), "Customer "+customerName+" created with account "+ AccountNumber));

	  }catch (Exception e){
		  recordRepository.SaveTraceRecord(new TraceRecord(new Date(), "Could not create customer "+customerName+" with account "+ AccountNumber));
		  emailSender.sendEmail(emailAddress, "We could not create your account  " + AccountNumber);
		  throw e;
	  }
   }

}
