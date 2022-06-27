package edu.miu.lab5partb.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	@Temporal(TemporalType.DATE)
	private Date payDate;
	private double amount;
}
