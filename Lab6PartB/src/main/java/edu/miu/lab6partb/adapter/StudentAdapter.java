package edu.miu.lab6partb.adapter;

import edu.miu.lab6partb.DTO.StudentDTO;
import edu.miu.lab6partb.domain.Student;
import edu.miu.lab6partb.repo.StudentRepo;

import java.util.List;
import java.util.stream.Collectors;

public class StudentAdapter {
public static Student getStudent(StudentDTO studentDTO){
    return new Student(studentDTO.getStudentNumber(), studentDTO.getName());
}
public static StudentDTO getStudentDTO(Student student){
    return new StudentDTO(student.getStudentNumber(),student.getName());
}
public List<StudentDTO> StudentDTOList(List<Student> students){
    return students.stream().map(StudentAdapter::getStudentDTO).collect(Collectors.toList());
}
}
