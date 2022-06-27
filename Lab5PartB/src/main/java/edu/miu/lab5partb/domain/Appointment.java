package edu.miu.lab5partb.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@SequenceGenerator(name = "appointmentseq",sequenceName = "APPOINTMENT_SEQUENCE")
public class Appointment {
    @Id
	@GeneratedValue(generator = "appointmentSeq")
	private long id;
	@Temporal(TemporalType.DATE)
	private Date appdate;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Patient patient;
	@Embedded
	private Payment payment;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Doctor doctor;

	public Appointment() {
	}

	public Appointment(Date appdate, Patient patient, Payment payment,
			Doctor doctor) {
		this.appdate = appdate;
		this.patient = patient;
		this.payment = payment;
		this.doctor = doctor;
	}
}
