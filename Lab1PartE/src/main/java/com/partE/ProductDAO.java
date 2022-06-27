package com.partE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("productDAO")
public class ProductDAO implements IProdcutDAO {
    List<Product> products = new ArrayList<>();
    @Autowired
    ILogger logger;

    @Override
    public void save(Product product) {
        products.add(product);
        System.out.println("ProductDAO: saving product "+product.getName());
        logger.log("product is saved in the DB: "+ product.getName() );
    }
}
