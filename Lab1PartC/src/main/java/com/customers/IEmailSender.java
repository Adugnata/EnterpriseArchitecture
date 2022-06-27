package com.customers;

public interface IEmailSender {
	void sendEmail(String email, String message);
	String getOutgoingMailServer();
}