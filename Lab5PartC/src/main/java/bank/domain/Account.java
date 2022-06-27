package bank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Account {
	@Id  
	long accountnumber;

	@OneToMany (cascade={CascadeType.ALL}, fetch= FetchType.EAGER)
	@JoinColumn(name="accountnr")
	Collection<AccountEntry> entryList = new ArrayList<AccountEntry>();

	@ManyToOne (cascade={CascadeType.ALL})
	@JoinColumn(name="customerid")
	Customer customer;
	public Account (long accountnr){
		this.accountnumber = accountnr;
	}
	public double getBalance() {
		return entryList.stream().mapToDouble(AccountEntry::getAmount).sum();
	}
	public void deposit(double amount){
		AccountEntry entry = new AccountEntry(new Date(), amount, "deposit", "", "");
		entryList.add(entry);
	}
	public void withdraw(double amount){
		AccountEntry entry = new AccountEntry(new Date(), -amount, "withdraw", "", "");
		entryList.add(entry);	
	}

	private void addEntry(AccountEntry entry){
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description){
		AccountEntry fromEntry = new AccountEntry(new Date(), -amount, description, ""+toAccount.getAccountnumber(), toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(new Date(), amount, description, ""+toAccount.getAccountnumber(), toAccount.getCustomer().getName());
		entryList.add(fromEntry);	
		toAccount.addEntry(toEntry);
	}

}
