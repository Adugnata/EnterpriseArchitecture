package bank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;
	private String name;
	public Customer(String name) {
		this.name = name;
	}

}
