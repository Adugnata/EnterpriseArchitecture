package com.springdijavaconfig;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private EmailService emailService;
    public void addCustomer(){
        emailService.sendEmail();
    }
    public void setEmailService(EmailService emailService){
        this.emailService = emailService;
    }
}
