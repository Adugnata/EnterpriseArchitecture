package edu.miu.lab4parta.c.repo;

import edu.miu.lab4parta.c.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger,Long> {
}
