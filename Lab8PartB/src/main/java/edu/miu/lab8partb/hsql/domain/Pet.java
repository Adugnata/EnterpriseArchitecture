package edu.miu.lab8partb.hsql.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Pet {
    @Id
   @GeneratedValue
    private Long id;
    private String name;
    private int age;

    public Pet() {
    }
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
