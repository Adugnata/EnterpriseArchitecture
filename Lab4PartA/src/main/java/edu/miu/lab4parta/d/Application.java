package edu.miu.lab4parta.d;

import edu.miu.lab4parta.d.domain.School;
import edu.miu.lab4parta.d.domain.Student;
import edu.miu.lab4parta.d.service.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    ISchoolService service;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        School school = new School("MIU");
     school.addStudent("Tesfamichael","Adugna");
     service.save(school);
    }
}
