package edu.miu.lab3partb;

import edu.miu.lab3partb.domain.Book;
import edu.miu.lab3partb.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.save(new Book(1, "Design pattern", "1234567890", "GOF", 120));
        bookRepository.save(new Book(2,"Head First","1234565543","Elisa",124));
        bookRepository.save(new Book(3,"Algorithm","123456678","Tesfamichael",200));
        bookRepository.findAll().forEach(System.out::println);
    }
}
