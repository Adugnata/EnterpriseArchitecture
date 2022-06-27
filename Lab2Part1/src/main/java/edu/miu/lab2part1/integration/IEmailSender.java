package edu.miu.lab2part1.integration;

public interface IEmailSender {
	void sendEmail(String email, String message);
	String getOutgoingMailServer();
}