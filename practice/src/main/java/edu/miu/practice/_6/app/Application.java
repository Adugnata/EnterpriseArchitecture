package edu.miu.practice._6.app;



import edu.miu.practice._6.domain.Contact;
import edu.miu.practice._6.domain.Student;
import edu.miu.practice._6.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("edu.miu.practice._6")
@EnableJpaRepositories("edu.miu.practice._6.repo")
@EntityScan("edu.miu.practice._6.domain")
public class Application implements CommandLineRunner {
    @Autowired
    private IStudentService service;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Student student = new Student("1234","John");
        student.addCourse("544","EA","Rene","Computer science");
        student.setContact(new Contact("john@miu.edu","123344","44843894"));
        service.save(student);

    }
}
