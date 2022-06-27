package edu.miu.lab4parta.d.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @MapKey(name = "studentId")
    private Map<Long,Student> students;

    public School(String name) {
        this.name = name;
        this.students = new HashMap<>();
    }
    public void addStudent(String firstname, String lastname){
        Student student = new Student(firstname,lastname);
        students.put(student.getStudentId(),student);
    }
}
