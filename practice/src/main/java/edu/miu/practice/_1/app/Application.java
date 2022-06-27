package edu.miu.practice._1.app;

import edu.miu.practice._1.domain.Customer;
import edu.miu.practice._1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("edu.miu.practice._1.domain")
@EnableJpaRepositories("edu.miu.practice._1.repo")
@ComponentScan(basePackages = "edu.miu.practice._1")
public class Application implements CommandLineRunner {
    @Autowired
    ICustomerService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.addCustomer(new Customer("Tesfamichael","tadugna@miu.edu"));
    }
}
