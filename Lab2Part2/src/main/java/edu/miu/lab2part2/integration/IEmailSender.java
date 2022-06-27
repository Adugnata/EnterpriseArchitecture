package edu.miu.lab2part2.integration;

public interface IEmailSender {
	void sendEmail(String email, String message);
	String getOutgoingMailServer();
}