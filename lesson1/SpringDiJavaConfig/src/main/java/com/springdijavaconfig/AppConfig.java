package com.springdijavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CustomerService customerService(){
        CustomerService customerService = new CustomerService();
        customerService.setEmailService(emailService());
        return customerService;
    }

    private EmailService emailService() {
        return new EmailService();
    }
}
