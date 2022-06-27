package edu.miu.lab4parta.c.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue
    private long id;
    private String flightnumber;
    @Column(name = "departure")
    private String from;
    @Column(name = "arrival")
    private String to;
    private LocalDateTime date;

    Flight(String flightnumber, String from, String to, LocalDateTime date) {
        this.flightnumber = flightnumber;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
