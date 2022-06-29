package edu.miu.bank.integration;

public interface IMessageSender {
    void sendEmail(String emailAddress, String message);
}
