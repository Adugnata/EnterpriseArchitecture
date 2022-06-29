package edu.miu.practice._5.domain;

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
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id")
    private Contact contact;

    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(String courseNumber, String courseName,Professor professor) {
        Course course = new Course(courseNumber, courseName);
        course.addStudent(this);
        course.setProfessor(professor);
        courses.add(course);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentNumber='").append(studentNumber).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
