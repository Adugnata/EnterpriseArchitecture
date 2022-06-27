package com.contact.integration;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    public void sendEmail(String emailAdress,String message){
        System.out.println("Send email message " + message + " to " + emailAdress);
    }
}
