package edu.miu.lab4parta.b;

import edu.miu.lab4parta.b.domain.Book;
import edu.miu.lab4parta.b.domain.Publisher;
import edu.miu.lab4parta.b.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    IBookService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book(12345,"Design Pattern","GOF");
        Book book2 = new Book(12345,"Becoming","Obama");
        Publisher publisher = new Publisher("Oxford");
        book1.setPublisher(publisher);
        service.save(book1);
        service.save(book2);
    }
}
