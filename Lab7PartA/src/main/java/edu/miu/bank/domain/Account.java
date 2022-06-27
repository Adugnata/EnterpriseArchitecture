package edu.miu.bank.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Account {
	@Id
	@GeneratedValue
	private long id;
	private String accountNumber;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
