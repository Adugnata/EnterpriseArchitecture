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
public class Course {
    @Id
    private String CourseNumber;
    private String courseName;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stu_crs",joinColumns = @JoinColumn(name = "CourseNumber"),inverseJoinColumns = @JoinColumn(name = "studentNumber"))
    private List<Student> students;

    public Course(String courseNumber, String courseName) {
        CourseNumber = courseNumber;
        this.courseName = courseName;
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("CourseNumber='").append(CourseNumber).append('\'');
        sb.append(", courseName='").append(courseName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
