package edu.miu.practice._7.integration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class EmailSender implements IMessageSender {
    @Override
    public void sendEmail() {
        System.out.println("Sending email");
    }
}
