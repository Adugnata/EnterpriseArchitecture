package edu.miu.lab5partb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@NoArgsConstructor
@Data
@SequenceGenerator(name = "doctorSeq",sequenceName = "DOCTOR_SEQUENCE")
public class Doctor {
    @Id
	@GeneratedValue(generator = "doctorSeq")
	private long id;
	private String doctorType;
	private String firstName;
	private String lastName;

	public Doctor(String doctorType, String firstName, String lastName) {
		this.doctorType = doctorType;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
