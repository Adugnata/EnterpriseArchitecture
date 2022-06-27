package edu.miu.lab4partb.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Orderline {
    @Id
    @GeneratedValue
    private long id;
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Product product;

    Orderline(int quantity) {
        this.quantity = quantity;
    }
}
