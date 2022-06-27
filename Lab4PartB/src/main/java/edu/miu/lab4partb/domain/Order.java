package edu.miu.lab4partb.domain;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "c_order")
public class Order {
    @Id
    @GeneratedValue
    private Long OrderNumber;
    private LocalDate date;
    private String status;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Orderline> orderlines;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Customer customer;

    public Order(LocalDate date, String status) {
        this.date = date;
        this.status = status;
        orderlines = new ArrayList<>();
    }
   public Orderline addOrderline(int quantity){
       Orderline orderline = new Orderline(quantity);
        orderlines.add(orderline);
        return orderline;
    }
}
