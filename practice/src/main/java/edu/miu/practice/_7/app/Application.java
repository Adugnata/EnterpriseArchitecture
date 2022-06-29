package edu.miu.practice._7.app;

import edu.miu.practice._7.domain.Customer;
import edu.miu.practice._7.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("edu.miu.practice._7.domain")
@EnableJpaRepositories("edu.miu.practice._7.repo")
@ComponentScan(basePackages = "edu.miu.practice._7")
public class Application implements CommandLineRunner {
    @Autowired
    IBankService bankService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bankService.createCustomerAndAccount(12, "Jack Bauer", "1223");
    }
}
