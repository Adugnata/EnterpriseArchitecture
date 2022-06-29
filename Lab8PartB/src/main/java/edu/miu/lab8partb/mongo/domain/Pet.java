package edu.miu.lab8partb.mongo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Pet {
    @Id
    private Long id;
    private String name;
    private int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
