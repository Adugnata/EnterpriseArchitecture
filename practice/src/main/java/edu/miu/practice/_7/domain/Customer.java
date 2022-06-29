package edu.miu.practice._7.domain;

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
    private long id;
    private String name;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
