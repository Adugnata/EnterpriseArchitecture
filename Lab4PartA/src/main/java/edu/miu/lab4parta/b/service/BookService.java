package edu.miu.lab4parta.b.service;

import edu.miu.lab4parta.b.domain.Book;
import edu.miu.lab4parta.b.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService{
    @Autowired
    BookRepo bookRepo;
    @Override
    public void save(Book book) {
        bookRepo.save(book);
    }
}
