package edu.miu.lab4parta.b.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Publisher(String name) {
        this.name = name;
    }
}
