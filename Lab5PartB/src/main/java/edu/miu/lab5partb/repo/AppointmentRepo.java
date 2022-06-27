package edu.miu.lab5partb.repo;

import edu.miu.lab5partb.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Long> {
}
