package edu.miu.practice._3.app;

import edu.miu.practice._3.dto.ProductDTO;
import edu.miu.practice._3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("edu.miu.practice._3.domain")
@EnableJpaRepositories("edu.miu.practice._3.repo")
@ComponentScan(basePackages = "edu.miu.practice._3")
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    ProductService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ProductDTO p1 = new ProductDTO("123", "keybord", 20, "accessory");
        ProductDTO p2 = new ProductDTO("124", "harddisk", 60, "accessory");
        service.addProduct(p1);
        service.addProduct(p2);
        service.findByCategory("accessory").forEach(System.out::println);
        service.findByPriceGreaterThan(10).forEach(System.out::println);
    }
}
