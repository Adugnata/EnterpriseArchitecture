package edu.miu.lab4parta.d.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    private String firstName;
    private String lastName;

   public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
