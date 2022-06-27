package edu.miu.lab4partb.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("DVD")
public class DVD extends Product{
    private String genere;

     DVD(String name, double price, String genere) {
        super(name, price);
        this.genere = genere;
    }
    DVD(){}
}
