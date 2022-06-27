package edu.miu.lab4parta.a;

import edu.miu.lab4parta.a.domain.Department;
import edu.miu.lab4parta.a.domain.Employee;
import edu.miu.lab4parta.a.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    IDepartmentService departmentService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Department department = new Department("Computer Science");
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Doe");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        employee1.setDepartment(department);
        employee2.setDepartment(department);
        departmentService.save(department);
    }
}
