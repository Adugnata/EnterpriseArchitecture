package edu.miu.practice._7.service;

import edu.miu.practice._7.domain.Account;

public interface IBankService {
    void createCustomerAndAccount(long customerId, String customerName, String AccountNumber);
}
