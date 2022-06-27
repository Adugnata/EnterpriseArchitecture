package edu.miu.lab6partb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String grade;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Course course;
   public Grade(String name) {
        this.grade = name;
    }

    public Grade() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                '}';
    }
}
