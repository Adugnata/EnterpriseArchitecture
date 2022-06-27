package edu.miu.lab5partb;

import edu.miu.lab5partb.domain.Appointment;
import edu.miu.lab5partb.domain.Doctor;
import edu.miu.lab5partb.domain.Patient;
import edu.miu.lab5partb.domain.Payment;
import edu.miu.lab5partb.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    IAppointmentService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Doctor doctor = new Doctor("Neurologist","John","Doe");
        Patient patient = new Patient("Lucy","1000 E st","10000","Afar");
        Payment payment = new Payment(new Date(),23.0);
        Appointment appointment = new Appointment(new Date(),patient,payment,doctor);
        service.save(appointment);
        System.out.println(service.findAll());
    }
}
