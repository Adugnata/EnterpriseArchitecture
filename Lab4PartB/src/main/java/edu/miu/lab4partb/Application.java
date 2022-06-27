package edu.miu.lab4partb;

import edu.miu.lab4partb.domain.*;
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
        Product product = new Product("keyborad", 40.0);
        Order order = new Order(LocalDate.now(), "completed");
        Orderline orderline = order.addOrderline(3);
        orderline.setProduct(product);
        customer.addOrder(order);
        order.setCustomer(customer);
        service.Save(order);


    }
}
