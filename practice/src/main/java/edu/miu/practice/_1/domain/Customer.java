package edu.miu.practice._1.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
