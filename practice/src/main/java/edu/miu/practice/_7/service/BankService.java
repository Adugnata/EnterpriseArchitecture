package edu.miu.practice._7.service;

import edu.miu.practice._7.domain.Account;
import edu.miu.practice._7.domain.Customer;
import edu.miu.practice._7.integration.EmailSender;
import edu.miu.practice._7.repo.AccountRepo;
import edu.miu.practice._7.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService implements IBankService {
    @Autowired
    private AccountRepo accountRepository;
    @Autowired
    private CustomerRepo customerRepository;
    @Autowired
    private EmailSender emailSender;
    @Transactional
    public void createCustomerAndAccount(long customerId, String customerName, String AccountNumber){
        try {
            accountRepository.saveAccount(new Account(AccountNumber));
            customerRepository.saveCustomer(new Customer(customerId, customerName));
            emailSender.sendEmail();
        }
        catch(Exception e) {
            throw e;
        }
    }
}
