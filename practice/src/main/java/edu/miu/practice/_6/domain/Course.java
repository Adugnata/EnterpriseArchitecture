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
@SecondaryTable(name = "professor",pkJoinColumns = @PrimaryKeyJoinColumn(name = "CourseNumber"))
public class Course {
    @Id
    private String CourseNumber;
    private String courseName;
    @Column(table = "professor",name="name")
    private String professorName;
    @Column(table = "professor",name="department")
    private String departmentName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stu_crs",joinColumns = @JoinColumn(name = "CourseNumber"),inverseJoinColumns = @JoinColumn(name = "studentNumber"))
    private List<Student> students;

    public Course(String courseNumber, String courseName, String professorName, String departmentName) {
        CourseNumber = courseNumber;
        this.courseName = courseName;
        this.professorName = professorName;
        this.departmentName = departmentName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
