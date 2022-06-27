package edu.miu.lab4parta.c;

import edu.miu.lab4parta.c.domain.Passenger;
import edu.miu.lab4parta.c.service.IPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    IPassengerService service;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        Passenger passenger = new Passenger("Tesfamichael");
        passenger.addFlight("ET787","Addis Ababa","Chicago", LocalDateTime.now());
        service.save(passenger);
    }
}
