package edu.miu.lab6partb.service;

import edu.miu.lab6partb.domain.Student;
import edu.miu.lab6partb.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public List<Student> findByDepartment(String dep) {
        return studentRepo.findByDepartment(dep);
    }

    @Override
    public List<Student> findStudentByCourse(String course) {
        return studentRepo.findStudentByCourse(course);
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepo.findByName(name);
    }
}
