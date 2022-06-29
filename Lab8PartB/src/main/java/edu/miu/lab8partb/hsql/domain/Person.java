package edu.miu.lab8partb.hsql.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    List<Pet> pet = new ArrayList<>();
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addPet(Pet p){
        pet.add(p);
    }
}
