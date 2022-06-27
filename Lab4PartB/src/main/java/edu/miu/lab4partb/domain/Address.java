package edu.miu.lab4partb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String street;
    private String city;
    private int zip;
    private String country;

    public Address(String street, String city, int zip, String country) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }
}
