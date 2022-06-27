package edu.miu.lab4partb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("Book")
public class Book extends Product{
    private long isbn;

    Book(String name, double price, long isbn) {
        super(name, price);
        this.isbn = isbn;
    }
    Book(){}
}
