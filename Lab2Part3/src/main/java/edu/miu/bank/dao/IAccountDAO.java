package edu.miu.bank.dao;

import edu.miu.bank.domain.Account;

import java.util.Collection;



public interface IAccountDAO {
	public void saveAccount(Account account);
	public void updateAccount(Account account);
	public Account loadAccount(long accountnumber);
	public Collection<Account> getAccounts();
}
