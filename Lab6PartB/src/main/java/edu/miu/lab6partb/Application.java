package edu.miu.lab6partb;

import edu.miu.lab6partb.domain.Course;
import edu.miu.lab6partb.domain.Department;
import edu.miu.lab6partb.domain.Grade;
import edu.miu.lab6partb.domain.Student;
import edu.miu.lab6partb.repo.StudentRepo;
import edu.miu.lab6partb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private IStudentService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student(123, "John");
        s1.setDepartment(new Department("Computer Science"));
        Grade g1 = new Grade("3.9");
        g1.setCourse(new Course("EA"));
        s1.addGrade(g1);
        service.save(s1);
       service.findByDepartment("Computer Science").forEach(System.out::println);
       service.findStudentByCourse("EA").forEach(System.out::println);
       service.findByName("John").forEach(System.out::println);

    }
}
