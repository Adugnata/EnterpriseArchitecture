package edu.miu.practice._1.integration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("whatsapp")
public class WhatsAPPSender implements IMessageSender {
    @Override
    public void sendMessage(String address, String message) {
        StringBuilder st = new StringBuilder()
                .append("WhatsAPPSender: sending ")
                .append(message)
                .append(" to ")
                .append(address);
        System.out.println(st);
    }
}
