package edu.miu.lab8partb.mongo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    List<Pet> pet = new ArrayList<>();

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addPet(Pet p){
        pet.add(p);
    }
}
