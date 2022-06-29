package edu.miu.practice._5.app;

import edu.miu.practice._5.domain.Professor;
import edu.miu.practice._5.domain.Contact;
import edu.miu.practice._5.domain.Student;
import edu.miu.practice._5.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class Application implements CommandLineRunner {
    @Autowired
    private IStudentService service;
    public static void main(String[] args) {
        SpringApplication.run(edu.miu.practice._6.app.Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Student student = new Student("1234","John");
        student.addCourse("544","EA",new Professor("Rene","Computer science"));
        student.setContact(new Contact("john@miu.edu","123344","44843894"));
        service.save(student);
    }
}
