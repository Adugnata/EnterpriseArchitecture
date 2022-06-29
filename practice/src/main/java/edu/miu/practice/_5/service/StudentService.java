package edu.miu.practice._5.service;

import edu.miu.practice._5.domain.Student;
import edu.miu.practice._5.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public void save(Student student) {
studentRepo.save(student);
    }
}
