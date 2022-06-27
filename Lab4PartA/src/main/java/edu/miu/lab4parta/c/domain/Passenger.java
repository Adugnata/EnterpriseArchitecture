package edu.miu.lab4parta.c.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OrderColumn(name = "order_sequence")
    List<Flight> flights;

    public Passenger(String name) {
        flights = new ArrayList<>();
        this.name = name;
    }
    public void addFlight(String flightnumber, String from, String to, LocalDateTime date){
        flights.add(new Flight(flightnumber, from, to, date));
    }
}
