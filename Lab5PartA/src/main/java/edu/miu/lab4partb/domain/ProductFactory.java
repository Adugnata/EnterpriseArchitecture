package edu.miu.lab4partb.domain;

import edu.miu.lab4partb.factory.IProductFactory;

public class ProductFactory implements IProductFactory {
    @Override
    public CD createCD(String name, double price, String artist) {
        return new CD(name,price,artist);
    }

    @Override
    public DVD createDVD(String name, double price, String genre) {
        return new DVD(name,price,genre);
    }

    @Override
    public Book createBook(String name, double price, long isbn) {
        return new Book(name,price,isbn);
    }
}
