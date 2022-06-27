package edu.miu.lab4partb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
public class Address {
    //private long id;
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
