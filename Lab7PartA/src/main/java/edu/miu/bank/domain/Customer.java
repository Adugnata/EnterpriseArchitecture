package edu.miu.bank.domain;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer {
	@Id
	private long id;
	private String name;
    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;
	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}


