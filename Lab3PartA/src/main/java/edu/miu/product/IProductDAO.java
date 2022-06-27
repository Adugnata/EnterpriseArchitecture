package edu.miu.product;

import java.util.List;

public interface IProductDAO {
    void clearDB();

    void save(Product product);

    Product findByProductNumber(String productNumber);

    Supplier getSupplierNumber(String productNumber);

    Product findByProductName(String name);

    List<Product> getAllProducts();

    void removeProduct(String productNumber);
}
