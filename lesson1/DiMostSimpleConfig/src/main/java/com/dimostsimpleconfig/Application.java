package com.dimostsimpleconfig;

//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean("customerService",CustomerService.class);
        customerService.addCustomer();
    }

}
