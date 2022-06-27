package edu.miu.lab6partb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {
    @Id
    private long studentNumber;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Department department;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Grade> grades;

    public Student(long studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public Student() {

    }

    public void addGrade(Grade grade){
        if(Objects.equals(null,grades))grades = new ArrayList<>();
        grades.add(grade);
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
