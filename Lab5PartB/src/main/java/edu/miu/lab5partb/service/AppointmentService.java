package edu.miu.lab5partb.service;

import edu.miu.lab5partb.domain.Appointment;
import edu.miu.lab5partb.repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService implements IAppointmentService {
    @Autowired
    AppointmentRepo appointmentRepo;

    @Override
    public void save(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepo.findAll();
    }
}
