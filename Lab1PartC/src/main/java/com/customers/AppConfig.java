package com.customers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    CustomerService customerService() {
        CustomerService customerService = new CustomerService();
        customerService.setCustomerDAO(customerDAO());
        customerService.setEmailSender(emailSender());
        return customerService;
    }

    @Bean
    public IEmailSender emailSender() {
        return new EmailSender(new Logger());
    }

    @Bean
    public ICustomerDAO customerDAO() {
        return new CustomerDAO(new Logger());
    }
}
