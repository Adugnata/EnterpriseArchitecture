package edu.miu.lab4parta.c.service;

import edu.miu.lab4parta.c.domain.Passenger;
import edu.miu.lab4parta.c.repo.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService implements IPassengerService {
    @Autowired
    PassengerRepo passengerRepo;

    @Override
    public void save(Passenger passenger) {
        passengerRepo.save(passenger);
    }
}
