package edu.miu.lab4partb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String firstname;
    private String lastname;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Order> orders;
    @Embedded
    private Address address;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        orders = new ArrayList<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }
}
