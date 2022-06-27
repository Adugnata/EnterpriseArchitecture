package bank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class AccountEntry {

	@Id
	@GeneratedValue
	private long id;

	private Date date;
	private double amount;
	private String description;
	private String fromAccountNumber;
	private String fromPersonName;
	public AccountEntry(Date date, double amount, String description,
			String fromAccountNumber, String fromPersonName) {
		this.date = date;
		this.amount = amount;
		this.description = description;
		this.fromAccountNumber = fromAccountNumber;
		this.fromPersonName = fromPersonName;
	}
}
