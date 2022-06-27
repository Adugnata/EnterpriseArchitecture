package com.account;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {
    List<Account> accounts = new ArrayList<>();

    @Override
    public void addAccount(String accountNumber, Customer customer) {
        accounts.add(new Account(accountNumber, customer));
        System.out.println("In execution of method addAccount");
    }
}
