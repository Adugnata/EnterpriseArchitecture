package edu.miu.practice._6.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    private String studentNumber;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "students")
    private List<Course> courses;
    @Embedded
    private Contact contact;

    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
        courses = new ArrayList<Course>();
    }

    public void addCourse(String courseNumber, String courseName, String professorName,String departmentName) {
        Course course = new Course(courseNumber, courseName,professorName, departmentName);
        course.addStudent(this);
        courses.add(course);
    }
}
