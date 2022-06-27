package edu.miu.lab4partb.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("CD")
public class CD extends Product{
    private String artist;
    CD(String name, double price, String artist) {
        super(name, price);
        this.artist = artist;
    }
    CD(){}
}
