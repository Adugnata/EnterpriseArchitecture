package com.customers;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component("logger")
public class Logger implements ILogger{

	public void log(String logstring) {
		System.out.println("Logging "+LocalDateTime.now()+" "+logstring);		
	}

}
