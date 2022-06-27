package edu.miu.lab4parta.b.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private long isbn;
    private String title;
    private String author;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Publisher publisher;

    public Book(long isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
}
