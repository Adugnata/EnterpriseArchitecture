package edu.miu.lab5partb.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@SequenceGenerator(name = "patientSeq", sequenceName = "PATIENT_SEQUENCE")
@SecondaryTable(name = "address")
public class Patient {
    @Id
    @GeneratedValue(generator = "patientSeq")
    private Long id;
    private String name;
    @Column(table = "address")
    private String street;
    @Column(table = "address")
    private String zip;
    @Column(table = "address")
    private String city;

    public Patient(String name, String street, String zip, String city) {
        this.name = name;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }
}
