package edu.miu.lab5partb.service;

import edu.miu.lab5partb.domain.Appointment;

import java.util.List;

public interface IAppointmentService {
    void save(Appointment appointment);
    List<Appointment> findAll();
}
