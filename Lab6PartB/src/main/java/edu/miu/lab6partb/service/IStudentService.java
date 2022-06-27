package edu.miu.lab6partb.service;

import edu.miu.lab6partb.domain.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentService {
    void save(Student student);
    List<Student> findByDepartment(String dep);
    List<Student> findStudentByCourse(String course);
    List<Student> findByName(String name);
}
