package edu.miu.product;

import lombok.Data;

@Data
public class Product {
    private String productNumber;
    private String name;
    private double price;
    private Supplier supplier;

    public Product(String productNumber, String name, double price) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
    }
}
