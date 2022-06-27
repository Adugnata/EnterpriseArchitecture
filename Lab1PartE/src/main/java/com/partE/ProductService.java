package com.partE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService implements IProductService {
   @Autowired
    private IProdcutDAO prodcutDAO;
   @Autowired
    private IEmailSender emailSender;

    @Override
    public void addProduct(Product product) {
        prodcutDAO.save(product);
        System.out.println(product);
        emailSender.sendEmail(product.getName() + "@gmail.com", product.toString());
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "prodcutDAO=" + prodcutDAO +
                '}';
    }
}
