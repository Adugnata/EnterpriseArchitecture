package edu.miu.lab4partb;

import edu.miu.lab4partb.domain.*;
import edu.miu.lab4partb.domain.ProductFactory;
import edu.miu.lab4partb.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    IOrderService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("1000 N 4th st", "Fairfield", 52557, "USA");
        Customer customer = new Customer("Tesfamichael", "Adugna");
        customer.setAddress(address);
        ProductFactory factory = new ProductFactory();
        Product product1 = factory.createCD("Rise up",10,"Bob");
        Product product2 = factory.createDVD("National Geography",20,"xyz");
        Product product3 = factory.createBook("Design Pattern",30,12345678);
        Order order = new Order(LocalDate.now(), "completed");
        Orderline orderline1 = order.addOrderline(1);
        orderline1.setProduct(product1);
        Orderline orderline2 = order.addOrderline(1);
        orderline2.setProduct(product2);
        Orderline orderline3 = order.addOrderline(3);
        orderline3.setProduct(product3);
        customer.addOrder(order);
        order.setCustomer(customer);
        service.Save(order);


    }
}
