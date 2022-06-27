package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        CustomerService customerService = context.getBean("customerService",CustomerService.class);
        customerService.addCustomer();
    }

}
